package com.konteh.milospp.converter.desk;

import com.konteh.milospp.converter.AbstractConverter;
import com.konteh.milospp.dto.desk.DeskCreateDTO;
import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.konteh.milospp.model.Desk;
import com.konteh.milospp.service.RoomService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeskCreateDTOToDesk extends AbstractConverter<DeskCreateDTO, Desk> {

    private final RoomService roomService;

    @Override
    public Desk convert(@NotNull DeskCreateDTO source) {
        Desk desk = new Desk();

        desk.setOrder(source.getOrder());
        desk.setRoom(roomService.findOne(source.getRoomId()));
        return desk;
    }
}
