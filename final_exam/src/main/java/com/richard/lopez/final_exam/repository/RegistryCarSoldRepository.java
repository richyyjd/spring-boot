package com.richard.lopez.final_exam.repository;

import com.richard.lopez.final_exam.domain.RegistryCarSold;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rlopez on 21-06-17.
 */
public interface RegistryCarSoldRepository extends MongoRepository<RegistryCarSold, String> {
}
