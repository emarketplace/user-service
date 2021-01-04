package com.github.emarketplace.userservice.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
    private String sellerId;

    @Field(name = "legalName")
    private String legalName;

    @Field(name = "displayName")
    private String displayName;

    @Field(name = "emailId")
    private String emailId;

    @Field(name = "countryCode")
    private String countryCode;

    @Field(name = "mobileNumber")
    private String mobileNumber;

    @Field(name = "address")
    private String address;

    @Field(name = "city")
    private String city;

    @Field(name = "district")
    private String district;

    @Field(name = "state")
    private String state;

    @Field(name = "country")
    private String country;

    @Field(name = "postalCode")
    private String postalCode;

    @Field(name = "businessLicenseNumber")
    private String businessLicenseNumber;

    @Field(name = "taxId")
    private String taxId;

    @Field(name = "legalRepresentativeName")
    private String legalRepresentativeName;

    @Field(name = "legalRepresentativePhoneNumber")
    private String legalRepresentativePhoneNumber;

    @Field(name = "legalRepresentativeEmailId")
    private String legalRepresentativeEmailId;

    @Field(name = "legalRepresentativePicture")
    private String legalRepresentativePicture;

    @Field(name = "status")
    private String status;

    @Field(name = "createdDate")
    private Date createdDate;

    @Field(name = "lastModifiedDate")
    private Date lastModifiedDate;

    @Field(name = "sellerRating")
    private Integer sellerRating;

    @Field(name = "orderNotificationsEmailId")
    private String orderNotificationsEmailId;

    @Field(name = "catalogNotificationsEmailId")
    private String catalogNotificationsEmailId;

    @Field(name = "inventoryNotificationsEmailId")
    private String inventoryNotificationsEmailId;

    @Field(name = "generalNotificationsEmailId")
    private String generalNotificationsEmailId;

    @Field(name = "bankDetailsId")
    private String bankDetailsId;

    @Field(name = "commissionPercent")
    private Integer commissionPercent;

    @Field(name = "catalogApprovalRequired")
    private Boolean catalogApprovalRequired;
}
