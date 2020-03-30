package com.example.TalentHunter.api.model;

import com.example.TalentHunter.coreLibrary.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends BaseDto<Long> {

//    @NotNull
//    @Size(min = 1, max = 255)
//    private String name;
//
//    @NotNull
//    @Size(min = 1, max = 255)
//    private String lastName;

    @NotNull
    PersonDto personDto;

    @NotNull
    RegionDto regionDto;

    @NotNull
    Date birthday;

}
