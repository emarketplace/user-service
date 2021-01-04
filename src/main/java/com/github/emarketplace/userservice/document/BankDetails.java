package com.github.emarketplace.userservice.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "bankDetails")
public class BankDetails {

    @Id
    @Field(name = "_id")
    private String bankDetailsId;

    @Field(name = "bankStatementImage")
    private String bankStatementImage;

    @Field(name = "bankAccountName")
    private String bankAccountName;

    @Field(name = "bankAccountNumber")
    private String bankAccountNumber;

    @Field(name = "bankRoutingNumber")
    private String bankRoutingNumber;

    @Field(name = "bankName")
    private String bankName;

    @Field(name = "bankAddress")
    private String bankAddress;

    @Field(name = "bankComments")
    private String bankComments;
}
