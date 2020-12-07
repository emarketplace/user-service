package com.marketplace.userservice.service.impl;

import com.marketplace.library.dto.user.SellerSignupRequestDTO;
import com.marketplace.library.util.HashingUtil;
import com.marketplace.userservice.document.Seller;
import com.marketplace.userservice.exception.UserServiceBaseException;
import com.marketplace.userservice.exception.UserServiceError;
import com.marketplace.userservice.repository.SellerRepository;
import com.marketplace.userservice.service.SellerService;
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
public class SellerServiceImpl implements SellerService {
    private static final Logger logger = LoggerFactory.getLogger(SellerServiceImpl.class);

    private final ModelMapper modelMapper;
    private final SellerUserService sellerUserService;
    private final SellerRepository sellerRepository;

    @Override
    public void signupSeller(SellerSignupRequestDTO sellerSignupRequest) {
        sellerSignupRequest.setEmailId(sellerSignupRequest.getEmailId().toLowerCase());

        Optional<Seller> sellerExists = sellerRepository.findByEmailId(sellerSignupRequest.getEmailId());
        if (sellerExists.isPresent()) {
            logger.error("Error in processing request, Seller already registered with the given email:{}", HashingUtil.getSha256Hash(sellerSignupRequest.getEmailId()));
            throw new UserServiceBaseException(UserServiceError.SELLER_ALREADY_REGISTERED, HttpStatus.BAD_REQUEST);
        }

        sellerUserService.checkIfEmailAlreadyRegistered(sellerSignupRequest.getEmailId());

        Seller seller = new Seller();
        modelMapper.map(sellerSignupRequest, seller);

        seller.setStatus(PENDING);

        Date now = new Date();
        seller.setCreatedDate(now);
        seller.setLastModifiedDate(now);

        sellerRepository.save(seller);
        logger.info("Seller details saved successfully, email:{}", HashingUtil.getSha256Hash(sellerSignupRequest.getEmailId()));

        sellerUserService.signupSellerUser(sellerSignupRequest, seller);
    }
}
