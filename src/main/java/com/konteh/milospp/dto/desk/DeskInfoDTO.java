package com.konteh.milospp.dto.desk;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class DeskInfoDTO {
    @NotNull
    private Integer order;

    @NotNull
    private Integer roomId;
}
