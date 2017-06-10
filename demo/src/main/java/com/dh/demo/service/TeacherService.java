package com.dh.demo.service;

import com.dh.demo.domain.Teacher;
import com.dh.demo.repository.TeacherRepository;
import com.dh.demo.web.TeacherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Richard on 03/06/2017.
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    //Aqui ponemos todas las operaciones pa recuperar archivos, etc.
    public List<Teacher> getAllTeachers(){
        //TODO use repository
        /*List<Teacher> res = new ArrayList<>();
        res.add(new Teacher("rl", "Richard", 10101010, "Master of Puppets"));
        res.add(new Teacher("rl", "Juan", 8484848, "Ing. Sistemas"));
        res.add(new Teacher("rl", "Pedro", 2323232, "Ing. Sistemas"));
*/

        List<Teacher> res = teacherRepository.findAll(); //devuelve all that we have at DB
        return res;
    }

    public void addTeacher(TeacherController.TeacherRequestDTO newTeacherDTO){
        //TODO add into Database
        //return ;
        //        teacherRepository.findOne(newTeacher.getId());
//        teacherRepositsory.delete(newTeacher);
        /*
        teacherRepository.save(newTeacher); // con esto guardamos y ya puedo recuperar
        System.out.println(" -- the name of teacher is --> " + newTeacher.getName());*/

        Teacher newTeacher = new Teacher();
        newTeacher.setCi(newTeacherDTO.getCi());
        newTeacherDTO.setName(newTeacherDTO.getName());
        newTeacherDTO.setProfession(newTeacherDTO.getProfession());
    }

    public Teacher getTeacher(String id){
        //Teacher res = teacherRepository.getTeacherById(id);
        Teacher res = teacherRepository.findOne(id);
        return res;
    }

    public void deleteTeacher(String id){
        //Teacher res = teacherRepository.findOne(id);
        teacherRepository.delete(id);
    }

    //public void updateTeacher(Teacher teacher, String id, String name){
    public void updateTeacher(Teacher teacher){
        teacherRepository.save(teacher);
        //teacher = teacherRepository.

    }


}
