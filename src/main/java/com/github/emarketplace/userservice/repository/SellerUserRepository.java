package com.github.emarketplace.userservice.repository;

import com.github.emarketplace.userservice.document.SellerUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Repository
public interface SellerUserRepository extends MongoRepository<SellerUser, String> {
    Optional<SellerUser> findByEmailId(String emailId);
}
