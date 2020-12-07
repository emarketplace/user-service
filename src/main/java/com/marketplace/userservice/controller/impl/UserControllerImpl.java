package com.marketplace.userservice.controller.impl;

import com.marketplace.library.dto.user.SellerSignupRequestDTO;
import com.marketplace.library.util.HashingUtil;
import com.marketplace.userservice.controller.UserController;
import com.marketplace.userservice.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserControllerImpl.class);

    private final SellerService sellerService;

    @Override
    @PostMapping("/signup")
    public void signupSeller(@RequestBody SellerSignupRequestDTO sellerSignupRequest) {
        logger.info("Request received for seller signup, email:{}", HashingUtil.getSha256Hash(sellerSignupRequest.getEmailId().toLowerCase()));
        sellerService.signupSeller(sellerSignupRequest);
        logger.info("Processed request for seller signup, email:{}", HashingUtil.getSha256Hash(sellerSignupRequest.getEmailId().toLowerCase()));
    }
}
