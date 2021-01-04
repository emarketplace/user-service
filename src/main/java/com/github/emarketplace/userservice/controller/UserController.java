package com.github.emarketplace.userservice.controller;

import com.marketplace.library.dto.user.SellerSignupRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Tag(name = "users", description = "APIs of user related operations")
public interface UserController {

    @Operation(
            summary = "Signup seller with basic login details",
            description = "Signup seller with basic login details",
            operationId = "signupSeller()",
            responses = {
                    @ApiResponse(responseCode = "200")
            }
    )
    void signupSeller(SellerSignupRequestDTO sellerSignupRequest);
}
