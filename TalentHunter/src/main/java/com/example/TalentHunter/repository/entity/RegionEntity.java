package com.example.TalentHunter.repository.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "region")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegionEntity extends BaseEntity<Long> {

    @Size(min = 1, max = 255)
    private String name;
}
