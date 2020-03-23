package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.SkillDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.SkillEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SkillMapper extends BaseMapper<SkillDto, SkillEntity> {
}
