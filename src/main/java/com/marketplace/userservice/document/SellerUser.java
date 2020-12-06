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
@Document(collection = "sellerUsers")
public class SellerUser {

    @Id
    private String _id;
    private String userId;
    private String emailId;
    private String password;
    private Boolean changePassword;
    private String orgId;
    private String roleId;
    private String firstName;
    private String lastName;
    private String countryCode;
    private String mobileNumber;
    private Boolean mobileNumberValidated;
    private String status;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private Date lastLoginDate;
    private Date passwordChangeDate;
    private Integer loginFailAttempts;
}
