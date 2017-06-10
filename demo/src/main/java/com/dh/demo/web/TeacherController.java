package com.dh.demo.web;

import com.dh.demo.domain.Teacher;
import com.dh.demo.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Richard on 03/06/2017.
 */
@RestController
@RequestMapping("/teachers")
@Api(value="teacherEndpoints", description="Here there are all endpoints to let you interact with Teacher")
public class TeacherController {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @Autowired //al hacer autowired ya me lo inicializa el teacherService
    TeacherService teacherService;

    @ApiOperation(value = "Search a product with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }



    @ApiOperation(value = "Search a product with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.POST)
    public void addTeacher(@RequestBody TeacherRequestDTO newTeacherDTO){
        teacherService.addTeacher(newTeacherDTO);
    }

    @ApiOperation(value = "Search a product with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Teacher getTeacherById(@PathVariable String id){
        return teacherService.getTeacher(id);
    }

    @ApiOperation(value = "Search a product with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteTeacherById(@PathVariable String id){
        teacherService.deleteTeacher(id);
    }

    @ApiOperation(value = "Search a product with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateTeacherById(@RequestBody Teacher newTeacher, @PathVariable String id){
        Teacher x = getTeacherById(id);
        x.setName(newTeacher.getName());

        teacherService.updateTeacher(x);
        //x.setName();
        //teacherService.updateTeacher(x);
        //teacherService.updateTeacher(newTeacher, id, name);
    }


    public static class TeacherRequestDTO{

        private String name;
        private long ci;
        private String profession;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCi() {
            return ci;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }
    }
}
