package com.marketplace.userservice.controller.impl;

import com.marketplace.userservice.controller.UserController;
import com.marketplace.userservice.document.SellerUser;
import com.marketplace.userservice.dto.SellerUserDTO;
import com.marketplace.userservice.service.SellerUserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserControllerImpl.class);

    private final ModelMapper modelMapper;
    private final SellerUserService sellerUserService;

    @Override
    @GetMapping("/{version}/{id}")
    public SellerUserDTO getSellerUserDetails(@PathVariable("version") String version, @PathVariable("id") String sellerUserId) {
        logger.info("Processing request for getting sellerUserDetails for sellerUserId: {}", sellerUserId);
        SellerUser sellerUser = sellerUserService.getUserDetails(sellerUserId);
        if (sellerUser == null) {
            return null;
        }
        logger.info("Completed processing request for fetching sellerUserDetails for sellerUserId: {}", sellerUserId);
        return convertSellerUserToSellerUserDto(sellerUser, version);
    }

    @Override
    public SellerUserDTO convertSellerUserToSellerUserDto(SellerUser sellerUser, String version) {
        SellerUserDTO sellerUserDTO = modelMapper.map(sellerUser, SellerUserDTO.class);
        //Replace with switch if there is large number of versions
        if ("v1".equals(version)) {
            return sellerUserDTO;
        }
        return null;
    }

    @Override
    public SellerUser convertSellerUserToSellerUserDto(SellerUserDTO sellerUserDTO, String version) {
        SellerUser sellerUser = modelMapper.map(sellerUserDTO, SellerUser.class);
        //Replace with switch if there is large number of versions
        if ("v1".equals(version)) {
            return sellerUser;
        }
        return null;
    }
}
