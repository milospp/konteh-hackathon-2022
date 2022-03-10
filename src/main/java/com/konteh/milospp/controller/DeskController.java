package com.konteh.milospp.controller;

import com.konteh.milospp.converter.IConverter;
import com.konteh.milospp.converter.desk.DeskToDeskInfoDTO;
import com.konteh.milospp.converter.room.RoomToRoomInfoDTO;
import com.konteh.milospp.dto.desk.DeskCreateDTO;
import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.konteh.milospp.dto.room.RoomInfoDTO;
import com.konteh.milospp.model.Desk;
import com.konteh.milospp.model.Room;
import com.konteh.milospp.service.DeskService;
import com.konteh.milospp.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/desks")
@AllArgsConstructor
public class DeskController {
    private final DeskService deskService;
    private final DeskToDeskInfoDTO deskToDeskInfoDTO;
    private final IConverter<DeskCreateDTO, Desk> deskCreateDTOToDesk;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<DeskInfoDTO>> getDesks() {
        List<Desk> roomList = deskService.findAll();
        return new ResponseEntity<>(deskToDeskInfoDTO.convert(roomList), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, params = {"room"})
    public ResponseEntity<Collection<DeskInfoDTO>> getRoomDesks(@RequestParam("room") String roomId) {
        List<Desk> desks = deskService.getRoomDesks(roomId);
        return new ResponseEntity<>(deskToDeskInfoDTO.convert(desks), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DeskInfoDTO> postDesks(@RequestBody DeskCreateDTO deskCreateDTO) {
        Desk desk = deskCreateDTOToDesk.convert(deskCreateDTO);
        desk = deskService.save(desk);
        return new ResponseEntity<>(deskToDeskInfoDTO.convert(desk), HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Collection<DeskInfoDTO>> postDesks(@PathVariable String id) {
        deskService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
