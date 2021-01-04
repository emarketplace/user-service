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
@Document(collection = "sellerUsers")
public class SellerUser {

    @Id
    private String userId;

    @Field(name = "emailId")
    private String emailId;

    @Field(name = "password")
    private String password;

    @Field(name = "changePassword")
    private Boolean changePassword;

    @Field(name = "sellerId")
    private String sellerId;

    @Field(name = "firstName")
    private String firstName;

    @Field(name = "lastName")
    private String lastName;

    @Field(name = "countryCode")
    private String countryCode;

    @Field(name = "mobileNumber")
    private String mobileNumber;

    @Field(name = "mobileNumberValidated")
    private Boolean mobileNumberValidated;

    @Field(name = "status")
    private String status;

    @Field(name = "createdBy")
    private String createdBy;

    @Field(name = "createdDate")
    private Date createdDate;

    @Field(name = "lastModifiedBy")
    private String lastModifiedBy;

    @Field(name = "lastModifiedDate")
    private Date lastModifiedDate;

    @Field(name = "lastLoginDate")
    private Date lastLoginDate;

    @Field(name = "passwordChangeDate")
    private Date passwordChangeDate;

    @Field(name = "loginFailAttempts")
    private Integer loginFailAttempts;
}
