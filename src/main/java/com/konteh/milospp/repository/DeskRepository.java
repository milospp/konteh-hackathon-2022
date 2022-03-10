package com.konteh.milospp.repository;

import com.konteh.milospp.model.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskRepository extends JpaRepository<Desk, String> {
    List<Desk> getAllByRoomIdAndActiveIsTrue(String roomId);
}
