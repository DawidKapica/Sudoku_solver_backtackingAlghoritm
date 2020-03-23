package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.ProjectExperienceSkillDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.ProjectExperienceSkillEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.ProjectExperienceSkillService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class ProjectExperienceSkillServiceImpl extends BaseServiceImpl<ProjectExperienceSkillEntity, ProjectExperienceSkillDto, Long> implements ProjectExperienceSkillService {

    public ProjectExperienceSkillServiceImpl(
            BaseRepository<ProjectExperienceSkillEntity, Long> repository, BaseMapper<ProjectExperienceSkillDto, ProjectExperienceSkillEntity> mapper) {
        super(repository, mapper);
    }
}
