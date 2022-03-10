package com.konteh.milospp.repository;

import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
    List<Room> getAllByFacultyId(String facultyId);
}
