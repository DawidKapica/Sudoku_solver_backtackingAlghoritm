package com.example.TalentHunter.api.model;

import com.example.TalentHunter.coreLibrary.BaseDto;

import javax.validation.constraints.NotNull;

public class ProjectExperienceSkillDto extends BaseDto<Long> {

    @NotNull
    private Long  projectExperienceId;

    @NotNull
    private SkillDto skillDto;
}
