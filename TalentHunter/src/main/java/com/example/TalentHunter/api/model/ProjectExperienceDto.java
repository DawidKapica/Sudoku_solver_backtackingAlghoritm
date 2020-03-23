package com.example.TalentHunter.api.model;

import com.example.TalentHunter.coreLibrary.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectExperienceDto extends BaseDto<Long> {

    private Long employeeId;

    private String name;
}
