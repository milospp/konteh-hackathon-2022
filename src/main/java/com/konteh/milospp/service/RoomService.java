package com.konteh.milospp.service;


import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.model.Room;

import java.util.List;

public interface RoomService extends JPAService<Room> {
    List<Room> getFacultyRooms(String facultyId);
}
