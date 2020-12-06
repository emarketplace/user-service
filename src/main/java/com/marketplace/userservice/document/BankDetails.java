package com.marketplace.userservice.document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private String _id;
    private String bankStatementImage;
    private String bankAccountName;
    private String bankAccountNumber;
    private String bankRoutingNumber;
    private String bankName;
    private String bankAddress;
    private String bankComments;
}
