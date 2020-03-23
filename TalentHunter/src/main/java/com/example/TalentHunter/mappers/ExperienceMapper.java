package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.ExperienceDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.ExperienceEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ExperienceMapper extends BaseMapper<ExperienceDto, ExperienceEntity> {
}
