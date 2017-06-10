package com.dh.demo.repository;

import com.dh.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Richard on 10/06/2017.
 */
public interface StudentRepository extends MongoRepository<Student, String> {
}
