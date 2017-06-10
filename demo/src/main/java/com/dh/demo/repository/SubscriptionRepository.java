package com.dh.demo.repository;

import com.dh.demo.domain.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Richard on 10/06/2017.
 */
public interface SubscriptionRepository extends MongoRepository<Subscription, String> { // esto es como mi conexion a mi BD
}
