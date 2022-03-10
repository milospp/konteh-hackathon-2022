package com.konteh.milospp.dto.room;

import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalTime;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor @Getter @Setter @Builder @AllArgsConstructor
public class RoomInfoDTO {
    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String facultyId;

    @NotNull
    private Collection<DeskInfoDTO> desks;
}
