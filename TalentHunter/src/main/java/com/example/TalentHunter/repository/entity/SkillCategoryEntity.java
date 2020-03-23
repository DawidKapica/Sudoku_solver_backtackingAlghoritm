package com.example.TalentHunter.repository.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "skill_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillCategoryEntity extends BaseEntity<Long> {

    @NotNull
    @Size(min = 1, max = 255)
    private String name;
}
