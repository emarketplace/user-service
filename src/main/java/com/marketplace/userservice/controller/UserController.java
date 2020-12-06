package com.marketplace.userservice.controller;

import com.marketplace.userservice.document.SellerUser;
import com.marketplace.userservice.dto.SellerUserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Tag(name = "users", description = "APIs of user related operations")
public interface UserController {

    @Operation(
            summary = "Get User Details by userId",
            description = "Get User Details by userId",
            operationId = "getSellerUserDetails()",
            responses = {
                    @ApiResponse(responseCode = "200", description = "User Details found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SellerUserDTO.class)))
            }
    )
    SellerUserDTO getSellerUserDetails(String version, String sellerUserId);

    SellerUserDTO convertSellerUserToSellerUserDto(SellerUser sellerUser, String version);

    SellerUser convertSellerUserToSellerUserDto(SellerUserDTO sellerUserDTO, String version);
}
