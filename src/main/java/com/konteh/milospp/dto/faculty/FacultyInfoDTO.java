package com.konteh.milospp.dto.faculty;

import com.konteh.milospp.dto.room.RoomInfoDTO;
import com.konteh.milospp.dto.working_hours.WorkingHoursInfoDTO;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;
import java.util.List;

@NoArgsConstructor @Getter @Setter
public class FacultyInfoDTO {
    @NotNull
    private String name;

    @NotNull
    private WorkingHoursInfoDTO workingHours;

    private List<RoomInfoDTO> rooms;
}
