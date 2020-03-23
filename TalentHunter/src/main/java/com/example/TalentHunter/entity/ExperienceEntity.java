package com.example.TalentHunter.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "experience")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceEntity extends BaseEntity<Long> {

    @ManyToOne
    @NotNull
    @JoinColumn(name = "position_id")
    private PositionEntity position;

    @OneToOne
    @NotNull
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;

    private Integer years;
}
