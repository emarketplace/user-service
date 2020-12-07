package com.marketplace.userservice.service.impl;

import com.marketplace.library.dto.user.SellerSignupRequestDTO;
import com.marketplace.library.util.HashingUtil;
import com.marketplace.userservice.constants.SellerStatusConstants;
import com.marketplace.userservice.document.Seller;
import com.marketplace.userservice.document.SellerUser;
import com.marketplace.userservice.exception.UserServiceBaseException;
import com.marketplace.userservice.exception.UserServiceError;
import com.marketplace.userservice.repository.SellerUserRepository;
import com.marketplace.userservice.service.SellerUserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

import static com.marketplace.userservice.constants.SellerStatusConstants.PENDING;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Service
@RequiredArgsConstructor
public class SellerUserServiceImpl implements SellerUserService {
    private static final Logger logger = LoggerFactory.getLogger(SellerUserServiceImpl.class);

    private final ModelMapper modelMapper;
    private final SellerUserRepository sellerUserRepository;

    @Override
    public void signupSellerUser(SellerSignupRequestDTO sellerSignupRequest, Seller seller) {
        SellerUser sellerUser = new SellerUser();
        modelMapper.map(sellerSignupRequest, sellerUser);

        String password = sellerSignupRequest.getPassword();
        String hashedPassword = HashingUtil.getSha256Hash(password);
        sellerUser.setPassword(hashedPassword);

        sellerUser.setChangePassword(true);
        sellerUser.setSellerId(seller.getSellerId());
        sellerUser.setMobileNumberValidated(false);
        sellerUser.setStatus(PENDING);
        //set createdBy and lastModifiedBy

        Date now = new Date();
        sellerUser.setCreatedDate(now);
        sellerUser.setLastModifiedDate(now);

        sellerUserRepository.save(sellerUser);
        logger.info("Seller user details saved successfully, email:{}", HashingUtil.getSha256Hash(sellerSignupRequest.getEmailId()));
    }

    @Override
    public void checkIfEmailAlreadyRegistered(String emailId) {
        Optional<SellerUser> sellerUserExists = sellerUserRepository.findByEmailId(emailId);
        if (sellerUserExists.isPresent()) {
            logger.error("Error in processing request, Seller user already registered with the given email:{}", HashingUtil.getSha256Hash(emailId));
            throw new UserServiceBaseException(UserServiceError.EMAIL_ALREADY_REGISTERED, HttpStatus.BAD_REQUEST);
        }

    }
}
