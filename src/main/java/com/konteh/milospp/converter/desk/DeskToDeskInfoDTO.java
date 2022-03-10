package com.konteh.milospp.converter.desk;

import com.konteh.milospp.converter.AbstractConverter;
import com.konteh.milospp.converter.IConverter;
import com.konteh.milospp.dto.desk.DeskInfoDTO;
import com.konteh.milospp.model.Desk;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeskToDeskInfoDTO extends AbstractConverter<Desk, DeskInfoDTO> {
    @Override
    public DeskInfoDTO convert(@NotNull Desk source) {
        return getModelMapper().map(source, DeskInfoDTO.class);
    }
}
