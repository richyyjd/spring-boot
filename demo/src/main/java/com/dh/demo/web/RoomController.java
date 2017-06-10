package com.dh.demo.web;

import com.dh.demo.domain.Room;
import com.dh.demo.domain.Student;
import com.dh.demo.service.RoomService;
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
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Room> getAllRooms(){

        return roomService.getAllRooms();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addRoom(@RequestBody RoomRequestDTO roomDTO){
        roomService.addRoom(roomDTO);
    }

    public static class RoomRequestDTO{
        private String id;
        private String code;
        private Long capacity;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Long getCapacity() {
            return capacity;
        }

        public void setCapacity(Long capacity) {
            this.capacity = capacity;
        }
    }
}
