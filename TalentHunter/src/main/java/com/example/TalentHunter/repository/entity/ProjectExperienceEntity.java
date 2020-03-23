package com.example.TalentHunter.repository.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "project_experience")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectExperienceEntity extends BaseEntity<Long> {

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee_id;

    @Size(min = 1, max = 255)
    @NotNull
    private String name;
}
