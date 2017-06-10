package com.dh.demo.repository;

import com.dh.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Richard on 03/06/2017.
 */
public interface TeacherRepository extends MongoRepository<Teacher, String>{ //va a guardar Teachers, y el tipo de su ID

    //List<Teacher> getTeacherById();

    // esto es lo mismo que hacer la consulta findOne
    @Query("{_id: ?0}")
    Teacher getTeacherById(String id);


}
