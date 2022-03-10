package com.konteh.milospp.controller;

import com.konteh.milospp.converter.faculty.FacultyToFacultyInfoDTO;
import com.konteh.milospp.converter.room.RoomToRoomInfoDTO;
import com.konteh.milospp.dto.faculty.FacultyInfoDTO;
import com.konteh.milospp.dto.room.RoomInfoDTO;
import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.model.Room;
import com.konteh.milospp.service.FacultyService;
import com.konteh.milospp.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/rooms")
@AllArgsConstructor
public class RoomController {
    private final RoomService roomService;
    private final RoomToRoomInfoDTO roomToRoomInfoDTO;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<RoomInfoDTO>> getRooms() {
        List<Room> roomList = roomService.findAll();
        return new ResponseEntity<>(roomToRoomInfoDTO.convert(roomList), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, params = {"faculty"})
    public ResponseEntity<Collection<RoomInfoDTO>> getFacultyRooms(@RequestParam("faculty") String faculty) {
        List<Room> roomList = roomService.getFacultyRooms(faculty);
        return new ResponseEntity<>(roomToRoomInfoDTO.convert(roomList), HttpStatus.OK);
    }
}
