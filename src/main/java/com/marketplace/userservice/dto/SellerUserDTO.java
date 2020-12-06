package com.marketplace.userservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.marketplace.userservice.document.SellerUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SellerUserDTO extends SellerUser {
}
