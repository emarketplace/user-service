package com.marketplace.userservice.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * @author Muhammed Shaheer
 * @since 07 December 2020
 */

@Getter
@Setter
public class UserServiceBaseException extends RuntimeException {

    private UserServiceError error;
    private HttpStatus status;

    public UserServiceBaseException(UserServiceError error, HttpStatus status) {
        this.error = error;
        this.status = status;
    }
}
