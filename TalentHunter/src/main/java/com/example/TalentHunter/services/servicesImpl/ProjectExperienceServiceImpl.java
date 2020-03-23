package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.ProjectExperienceDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.ProjectExperienceEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.ProjectExperienceService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class ProjectExperienceServiceImpl extends BaseServiceImpl<ProjectExperienceEntity, ProjectExperienceDto, Long> implements ProjectExperienceService {

    public ProjectExperienceServiceImpl(
            BaseRepository<ProjectExperienceEntity, Long> repository, BaseMapper<ProjectExperienceDto, ProjectExperienceEntity> mapper) {
        super(repository, mapper);
    }
}
