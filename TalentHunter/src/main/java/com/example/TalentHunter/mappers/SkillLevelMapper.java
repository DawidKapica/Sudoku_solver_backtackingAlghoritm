package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SkillLevelMapper extends BaseMapper<SkillLevelDto, SkillLevelEntity> {
}
