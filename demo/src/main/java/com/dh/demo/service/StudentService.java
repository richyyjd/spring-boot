package com.dh.demo.service;

import com.dh.demo.domain.Student;
import com.dh.demo.repository.StudentRepository;
import com.dh.demo.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Richard on 10/06/2017.
 */
@Service
public class StudentService { //En el servicio es donde se hace la logica de negocio, si pasa algo se pone la bandera a algo

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(StudentController.StudentRequestDTO studentDTO){
        //A nivel de repositoroi se tiene q hacer un translate al student

        //Armo mi domain object
        Student newStudent = new Student();
        newStudent.setCi(studentDTO.getCi());
        newStudent.setCodsis(studentDTO.getCodsis());
        newStudent.setName(studentDTO.getName());

        studentRepository.save(newStudent);


    }


}
