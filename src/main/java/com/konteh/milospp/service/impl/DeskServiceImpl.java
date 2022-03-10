package com.konteh.milospp.service.impl;

import com.konteh.milospp.model.Desk;
import com.konteh.milospp.model.Room;
import com.konteh.milospp.repository.DeskRepository;
import com.konteh.milospp.repository.FacultyRepository;
import com.konteh.milospp.service.DeskService;
import com.konteh.milospp.service.FacultyService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DeskServiceImpl extends JPAServiceImpl<Desk> implements DeskService {
    private final DeskRepository deskRepository;

    @Override
    protected JpaRepository<Desk, String> getEntityRepository() {
        return deskRepository;
    }

    @Override
    public List<Desk> getRoomDesks(String roomId) {
        return deskRepository.getAllByRoomId(roomId);
    }
}
