package com.example.TalentHunter.api.model;

import com.example.TalentHunter.coreLibrary.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDto extends BaseDto<Long> {

    @NotNull
    private PositionDto position;

    @NotNull
    private Long employeeId;

    @NotNull
    private long years;
}
