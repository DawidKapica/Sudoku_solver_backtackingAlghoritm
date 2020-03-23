package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.SkillDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.SkillEntity;
import com.example.TalentHunter.services.ContactService;
import com.example.TalentHunter.services.SkillService;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl extends BaseServiceImpl<SkillEntity, SkillDto, Long> implements SkillService {

    public SkillServiceImpl(
            BaseRepository<SkillEntity, Long> repository, BaseMapper<SkillDto, SkillEntity> mapper) {
        super(repository, mapper);
    }
}
