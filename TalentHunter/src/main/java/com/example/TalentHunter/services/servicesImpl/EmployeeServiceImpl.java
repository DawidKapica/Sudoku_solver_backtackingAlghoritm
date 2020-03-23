package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.EmployeeService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends BaseServiceImpl<EmployeeEntity, EmployeeDto, Long> implements EmployeeService {

    public EmployeeServiceImpl(
            BaseRepository<EmployeeEntity, Long> repository, BaseMapper<EmployeeDto, EmployeeEntity> mapper) {
        super(repository, mapper);
    }
}
