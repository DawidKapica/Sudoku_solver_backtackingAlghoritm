package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.SkillCategoryDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.SkillCategoryEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SkillCategoryMapper extends BaseMapper<SkillCategoryDto, SkillCategoryEntity> {
}
