package com.konteh.milospp.dto.faculty;

import com.konteh.milospp.dto.room.RoomInfoDTO;
import com.konteh.milospp.dto.working_hours.WorkingHoursInfoDTO;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.OneToOne;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class FacultyInfoDTO {
    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private WorkingHoursInfoDTO workingHours;

    private Collection<RoomInfoDTO> rooms;
}
