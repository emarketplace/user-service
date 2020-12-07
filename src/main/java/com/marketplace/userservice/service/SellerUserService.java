package com.marketplace.userservice.service;

import com.marketplace.library.dto.user.SellerSignupRequestDTO;
import com.marketplace.userservice.document.Seller;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

public interface SellerUserService {
    void signupSellerUser(SellerSignupRequestDTO sellerSignupRequest, Seller seller);

    void checkIfEmailAlreadyRegistered(String emailId);
}
