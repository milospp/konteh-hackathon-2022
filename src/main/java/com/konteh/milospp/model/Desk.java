package com.konteh.milospp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Desk extends BaseEntity{
    @Column(name = "order", nullable = false)
    Integer order;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
