package com.example.TalentHunter.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity extends BaseEntity<Long> {

    @NotNull
    @Size(min = 1, max = 255)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 255)
    private String lastName;

    @OneToOne
    @NotNull
    @JoinColumn(name = "contact_id")
    private ContactEntity contact_id;

}
