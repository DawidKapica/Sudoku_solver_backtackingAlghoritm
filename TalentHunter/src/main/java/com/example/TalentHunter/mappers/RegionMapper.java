package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.RegionDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.RegionEntity;
import org.mapstruct.Mapper;

@Mapper
public interface RegionMapper extends BaseMapper<RegionDto, RegionEntity> {
}
