package com.example.TalentHunter.api.model;

import com.example.TalentHunter.coreLibrary.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillLevelDto extends BaseDto<Long> {


    @NotNull
    @Max(4)
    @Min(3)
    private Integer level;

    @NotNull
    private Long employeeId;

    @NotNull
    private SkillDto skill;
}
