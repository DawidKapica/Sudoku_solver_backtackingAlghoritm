package com.example.TalentHunter.mappers;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<EmployeeDto, EmployeeEntity> {
}
