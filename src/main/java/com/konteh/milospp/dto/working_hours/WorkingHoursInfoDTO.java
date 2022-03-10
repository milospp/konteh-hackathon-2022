package com.konteh.milospp.dto.working_hours;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@NoArgsConstructor @Getter @Setter
public class WorkingHoursInfoDTO {
    @NotNull
    private String opens;

    @NotNull
    private String closes;
}
