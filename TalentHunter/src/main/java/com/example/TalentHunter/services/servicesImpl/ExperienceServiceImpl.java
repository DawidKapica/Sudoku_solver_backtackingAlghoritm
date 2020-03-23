package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.ExperienceDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.ExperienceEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.ExperienceService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImpl extends BaseServiceImpl<ExperienceEntity, ExperienceDto, Long> implements ExperienceService {

    public ExperienceServiceImpl(
            BaseRepository<ExperienceEntity, Long> repository, BaseMapper<ExperienceDto, ExperienceEntity> mapper) {
        super(repository, mapper);
    }
}
