package com.richard.lopez.final_exam.repository;

import com.mongodb.Mongo;
import com.richard.lopez.final_exam.domain.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rlopez on 21-06-17.
 */
public interface SellerRepository extends MongoRepository<Seller, String> {
}
