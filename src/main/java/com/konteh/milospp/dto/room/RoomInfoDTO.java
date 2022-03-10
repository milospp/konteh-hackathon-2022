package com.konteh.milospp.dto.room;

import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor @Getter @Setter
public class RoomInfoDTO {
    @NotNull
    private String name;

    @NotNull
    private Long facultyId;

    @NotNull
    private List<DeskInfoDTO> desks;
}
