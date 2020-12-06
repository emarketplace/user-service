package com.marketplace.userservice.service.impl;

import com.marketplace.userservice.document.SellerUser;
import com.marketplace.userservice.repository.UserRepository;
import com.marketplace.userservice.service.SellerUserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Service
@RequiredArgsConstructor
public class SellerUserServiceImpl implements SellerUserService {
    private static final Logger logger = LoggerFactory.getLogger(SellerUserServiceImpl.class);

    private final UserRepository userRepository;

    @Override
    public SellerUser getUserDetails(String userId) {
        logger.info("Fetching userDetails from repository for userId: {}", userId);
        Optional<SellerUser> optionalUser = userRepository.findByUserId(userId);
        logger.info("Completed fetching userDetails from repository for userId: {}", userId);
        return optionalUser.orElse(null);
    }
}
