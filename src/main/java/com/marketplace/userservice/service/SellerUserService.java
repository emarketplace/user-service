package com.marketplace.userservice.service;

import com.marketplace.userservice.document.SellerUser;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

public interface SellerUserService {
    SellerUser getUserDetails(String userId);
}
