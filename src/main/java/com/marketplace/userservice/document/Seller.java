package com.marketplace.userservice.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "sellers")
public class Seller {

    @Id
    private String _id;
    private String sellerId;
    private String legalName;
    private String displayName;
    private String emailId;
    private String countryCode;
    private String mobileNumber;
    private String address;
    private String city;
    private String district;
    private String state;
    private String country;
    private String postalCode;
    private String businessLicenseNumber;
    private String taxId;
    private String legalRepresentativeName;
    private String legalRepresentativePhoneNumber;
    private String legalRepresentativeEmailId;
    private String legalRepresentativePicture;
    private String status;
    private Date createdDate;
    private Date lastModifiedDate;
    private Integer sellerRating;
    private String orderNotificationsEmailId;
    private String catalogNotificationsEmailId;
    private String inventoryNotificationsEmailId;
    private String generalNotificationsEmailId;
    private String bankDetailsId;
    private Integer commissionPercent;
    private Boolean catalogApprovalRequired;
}
