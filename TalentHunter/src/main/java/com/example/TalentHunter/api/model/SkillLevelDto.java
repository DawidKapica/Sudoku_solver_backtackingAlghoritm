package com.example.TalentHunter.api.model;

import com.example.TalentHunter.coreLibrary.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillLevelDto extends BaseDto<Long> {


    @NotNull
    private int level;

    @NotNull
    private Long employeeId;

    @NotNull
    private SkillDto skill;
}
