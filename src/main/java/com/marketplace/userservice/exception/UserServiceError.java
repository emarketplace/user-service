package com.marketplace.userservice.exception;

import lombok.Getter;

/**
 * @author Muhammed Shaheer
 * @since 07 December 2020
 */

@Getter
public enum UserServiceError {
    SELLER_ALREADY_REGISTERED("USE_SAR", "Seller already registered"),
    EMAIL_ALREADY_REGISTERED("USE_EAR", "Email already Registered");

    private final String code;
    private final String message;

    UserServiceError(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
