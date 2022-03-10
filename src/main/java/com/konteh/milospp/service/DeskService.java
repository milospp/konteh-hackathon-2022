package com.konteh.milospp.service;


import com.konteh.milospp.model.Desk;

import java.util.List;

public interface DeskService extends JPAService<Desk> {
    List<Desk> getRoomDesks(String roomId);
}
