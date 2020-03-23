package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.ProjectExperienceDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.ProjectExperienceEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectExperienceMapper extends BaseMapper<ProjectExperienceDto, ProjectExperienceEntity> {
}
