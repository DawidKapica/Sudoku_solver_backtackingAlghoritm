package com.example.TalentHunter.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contact")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity extends BaseEntity<Long> {

    @Size(min = 1, max = 255)
    private String email;

    @Size(min = 1, max = 255)
    private String phone;
}
