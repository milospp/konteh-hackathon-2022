package com.konteh.milospp.converter.faculty;

import com.konteh.milospp.converter.AbstractConverter;
import com.konteh.milospp.converter.IConverter;
import com.konteh.milospp.converter.working_hours.WorkingHoursToWorkingHoursInfoDTO;
import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.konteh.milospp.dto.faculty.FacultyInfoDTO;
import com.konteh.milospp.dto.room.RoomInfoDTO;
import com.konteh.milospp.dto.working_hours.WorkingHoursInfoDTO;
import com.konteh.milospp.model.Desk;
import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.model.Room;
import com.konteh.milospp.model.WorkingHours;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@AllArgsConstructor
public class FacultyToFacultyInfoDTO extends AbstractConverter<Faculty, FacultyInfoDTO> {

    private final IConverter<Room, RoomInfoDTO> roomRoomInfoDTOIConverter;
    private final IConverter<WorkingHours, WorkingHoursInfoDTO> workingHoursInfoDTOIConverter;

    @Override
    public FacultyInfoDTO convert(@NotNull Faculty source) {
        Collection<RoomInfoDTO> rooms = roomRoomInfoDTOIConverter.convert(source.getRooms());
        WorkingHoursInfoDTO workingHoursInfoDTO = workingHoursInfoDTOIConverter.convert(source.getWorkingHours());
        return FacultyInfoDTO.builder()
                .id(source.getId())
                .name(source.getName())
                .rooms(rooms)
                .workingHours(workingHoursInfoDTO)
                .build();
    }
}
