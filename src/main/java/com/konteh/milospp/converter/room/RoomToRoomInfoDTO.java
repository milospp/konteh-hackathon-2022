package com.konteh.milospp.converter.room;

import com.konteh.milospp.converter.AbstractConverter;
import com.konteh.milospp.converter.IConverter;
import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.konteh.milospp.dto.room.RoomInfoDTO;
import com.konteh.milospp.model.Desk;
import com.konteh.milospp.model.Room;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@AllArgsConstructor
public class RoomToRoomInfoDTO extends AbstractConverter<Room, RoomInfoDTO> {
    private final IConverter<Desk, DeskInfoDTO> deskInfoDTOIConverter;

    @Override
    public RoomInfoDTO convert(@NotNull Room source) {
        Collection<DeskInfoDTO> desks = deskInfoDTOIConverter.convert(source.getDesks());

        return RoomInfoDTO.builder()
                .desks(desks)
                .id(source.getId())
                .facultyId(source.getFaculty().getId())
                .build();
    }
}
