package com.konteh.milospp.converter.working_hours;

import com.konteh.milospp.converter.AbstractConverter;
import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.konteh.milospp.dto.working_hours.WorkingHoursInfoDTO;
import com.konteh.milospp.model.Desk;
import com.konteh.milospp.model.WorkingHours;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class WorkingHoursToWorkingHoursInfoDTO extends AbstractConverter<WorkingHours, WorkingHoursInfoDTO> {
    @Override
    public WorkingHoursInfoDTO convert(@NotNull WorkingHours source) {
        return getModelMapper().map(source, WorkingHoursInfoDTO.class);
    }
}
