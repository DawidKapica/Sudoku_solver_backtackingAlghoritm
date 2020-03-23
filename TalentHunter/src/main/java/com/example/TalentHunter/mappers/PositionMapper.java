package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.PositionDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.PositionEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PositionMapper extends BaseMapper<PositionDto, PositionEntity> {
}
