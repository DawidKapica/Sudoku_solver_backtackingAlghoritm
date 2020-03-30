package com.example.TalentHunter.entity;

import com.example.TalentHunter.coreLibrary.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity extends BaseEntity<Long> {

    @OneToOne
    @NotNull
    @JoinColumn(name = "person_id")
    private PersonEntity person_id;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "region_id")
    private RegionEntity region_id;

    @Column(name = "birthday")
    Date birthday;

}
