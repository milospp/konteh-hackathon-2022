package com.konteh.milospp.controller;

import com.konteh.milospp.converter.faculty.FacultyToFacultyInfoDTO;
import com.konteh.milospp.dto.faculty.FacultyInfoDTO;
import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.service.FacultyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/faculties")
@AllArgsConstructor
public class RoomController {
    private final FacultyService roomSe;
    private final FacultyToFacultyInfoDTO toFacultyInfoDTO;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<FacultyInfoDTO>> getFaculties() {
        List<Faculty> facultyList = facultyService.findAll();
        return new ResponseEntity<>(toFacultyInfoDTO.convert(facultyList), HttpStatus.CREATED);
    }
}
