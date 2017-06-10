package com.dh.demo.service;

import com.dh.demo.domain.Room;
import com.dh.demo.repository.RoomRepository;
import com.dh.demo.web.RoomController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Richard on 10/06/2017.
 */
@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public void addRoom(RoomController.RoomRequestDTO roomDTO){
        Room nwRoom = new Room();
        nwRoom.setCode(roomDTO.getCode());
        nwRoom.setCapacity(roomDTO.getCapacity());

        roomRepository.save(nwRoom);

    }
}
