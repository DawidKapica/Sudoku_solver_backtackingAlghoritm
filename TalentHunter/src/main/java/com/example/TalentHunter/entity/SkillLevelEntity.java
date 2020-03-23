package com.example.TalentHunter.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "skill_level")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillLevelEntity extends BaseEntity<Long> {

    @NotNull
    @Max(4)
    @Min(3)
    private Integer level;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee_id;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "skill_id")
    private SkillEntity skill_id;
}
