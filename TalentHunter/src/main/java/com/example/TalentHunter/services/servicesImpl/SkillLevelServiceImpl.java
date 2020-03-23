package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.SkillDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.ContactService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class SkillLevelServiceImpl extends BaseServiceImpl<SkillLevelEntity, SkillLevelDto, Long> implements SkillLevelService {

    public SkillLevelServiceImpl(
            BaseRepository<SkillLevelEntity, Long> repository, BaseMapper<SkillLevelDto, SkillLevelEntity> mapper) {
        super(repository, mapper);
    }
}
