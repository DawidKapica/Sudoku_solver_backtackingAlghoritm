package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.ContactDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ContactMapper extends BaseMapper<ContactDto, ContactEntity> {
}
