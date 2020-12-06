package com.marketplace.userservice.repository;

import com.marketplace.userservice.document.SellerUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Repository
public interface UserRepository extends MongoRepository<SellerUser, String> {
    Optional<SellerUser> findByUserId(String userId);
}
