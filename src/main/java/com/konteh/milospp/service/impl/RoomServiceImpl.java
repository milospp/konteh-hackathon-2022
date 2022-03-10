package com.konteh.milospp.service.impl;

import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.model.Room;
import com.konteh.milospp.repository.FacultyRepository;
import com.konteh.milospp.repository.RoomRepository;
import com.konteh.milospp.service.FacultyService;
import com.konteh.milospp.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RoomServiceImpl extends JPAServiceImpl<Room> implements RoomService {
    private final RoomRepository roomRepository;

    @Override
    protected JpaRepository<Room, String> getEntityRepository() {
        return roomRepository;
    }

    @Override
    public List<Room> getFacultyRooms(String facultyId) {
        return roomRepository.getAllByFacultyId(facultyId);
    }
}
