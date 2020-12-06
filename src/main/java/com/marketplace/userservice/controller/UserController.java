package com.marketplace.userservice.controller;

import com.marketplace.userservice.document.SellerUser;
import com.marketplace.userservice.dto.SellerUserDTO;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

public interface UserController {

    SellerUserDTO getSellerUserDetails(String version, String sellerUserId);

    SellerUserDTO convertSellerUserToSellerUserDto(SellerUser sellerUser, String version);

    SellerUser convertSellerUserToSellerUserDto(SellerUserDTO sellerUserDTO, String version);
}
