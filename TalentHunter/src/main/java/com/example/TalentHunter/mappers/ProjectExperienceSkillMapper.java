package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.ProjectExperienceSkillDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.ProjectExperienceSkillEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectExperienceSkillMapper extends BaseMapper<ProjectExperienceSkillDto, ProjectExperienceSkillEntity> {
}
