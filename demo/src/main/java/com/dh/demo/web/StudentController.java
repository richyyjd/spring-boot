package com.dh.demo.web;

import com.dh.demo.domain.Student;
import com.dh.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Richard on 10/06/2017.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addStudent(@RequestBody StudentRequestDTO student){
        studentService.addNewStudent(student);
    }

    public static class StudentRequestDTO{

        private String name;
        private Long ci;
        private Long codsis;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getCi() {
            return ci;
        }

        public void setCi(Long ci) {
            this.ci = ci;
        }

        public Long getCodsis() {
            return codsis;
        }

        public void setCodsis(Long codsis) {
            this.codsis = codsis;
        }
    }
}
