package com.richard.lopez.final_exam.repository;

import com.richard.lopez.final_exam.domain.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rlopez on 21-06-17.
 */
public interface BuyerRepository extends MongoRepository<Buyer, String>{
}
