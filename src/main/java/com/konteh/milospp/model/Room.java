package com.konteh.milospp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Room extends BaseEntity{

    @Column(name = "name", nullable = false)
    String name;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "room")
    private List<Desk> desks;

}
