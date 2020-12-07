package com.marketplace.userservice.service;

import com.marketplace.library.dto.user.SellerSignupRequestDTO;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

public interface SellerService {
    void signupSeller(SellerSignupRequestDTO sellerSignupRequest);
}
