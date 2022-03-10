package com.konteh.milospp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name = "working_hours")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class WorkingHours extends BaseEntity {

    @Column(name = "opens", nullable = false)
    LocalTime opens;
    @Column(name = "closes", nullable = false)
    LocalTime closes;

}
