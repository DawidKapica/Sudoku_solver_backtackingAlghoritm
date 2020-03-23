package com.example.TalentHunter.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "project_experience_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectExperienceSkillEntity extends BaseEntity<Long> {


    @OneToOne
    @NotNull
    @JoinColumn(name = "projectExperience_id")
    private ProjectExperienceEntity projectExperienceId;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "skill_id")
    private SkillEntity skill_id;
}
