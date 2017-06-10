package com.dh.demo.repository;

import com.dh.demo.domain.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Richard on 10/06/2017.
 */
public interface RoomRepository extends MongoRepository<Room, String> {

}
