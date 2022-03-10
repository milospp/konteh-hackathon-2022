package com.konteh.milospp.controller;

import com.konteh.milospp.dto.faculty.FacultyInfoDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/faculties")
@AllArgsConstructor
public class FaculcyController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FacultyInfoDTO> createCounter(CounterInsertDTO counterInsertDTO) {
        Counter counter = counterService.createCounter(counterInsertDTO);
        return new ResponseEntity<>(modelMapper.map(counter, CounterDTO.class), HttpStatus.CREATED);
    }
}
