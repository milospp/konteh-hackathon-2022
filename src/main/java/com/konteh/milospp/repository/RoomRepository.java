package com.konteh.milospp.repository;

import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
}
