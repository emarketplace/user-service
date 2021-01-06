package com.github.emarketplace.userservice.service;

import com.github.emarketplace.library.dto.user.SellerSignupRequestDTO;
import com.github.emarketplace.userservice.document.Seller;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

public interface SellerUserService {
    void signupSellerUser(SellerSignupRequestDTO sellerSignupRequest, Seller seller);

    void checkIfEmailAlreadyRegistered(String emailId);
}
