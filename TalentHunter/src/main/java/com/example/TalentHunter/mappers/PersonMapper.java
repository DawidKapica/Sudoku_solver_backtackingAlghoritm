package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.PersonDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper extends BaseMapper<PersonDto, PersonEntity> {
}
