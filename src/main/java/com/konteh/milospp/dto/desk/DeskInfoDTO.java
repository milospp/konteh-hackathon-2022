package com.konteh.milospp.dto.desk;

import com.sun.istack.NotNull;
import lombok.*;

@NoArgsConstructor @Getter @Setter @Builder @AllArgsConstructor
public class DeskInfoDTO {
    @NotNull
    private String id;

    @NotNull
    private Integer order;

    @NotNull
    private String roomId;
}
