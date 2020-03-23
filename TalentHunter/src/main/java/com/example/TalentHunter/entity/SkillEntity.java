package com.example.TalentHunter.entity;

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
@Table(name = "skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillEntity extends BaseEntity<Long> {

    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "skillCategory_id")
    private SkillCategoryEntity skillCategory_id;
}
