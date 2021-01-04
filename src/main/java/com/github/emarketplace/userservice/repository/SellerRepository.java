package com.github.emarketplace.userservice.repository;

import com.github.emarketplace.userservice.document.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SellerRepository extends MongoRepository<Seller, String> {
    Optional<Seller> findByEmailId(String emailId);
}
