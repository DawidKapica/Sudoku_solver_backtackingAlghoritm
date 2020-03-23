package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.ProjectExperienceSkillDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.ProjectExperienceSkillEntity;
import com.example.TalentHunter.services.ProjectExperienceSkillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.PROJECT_EXPERIENCES_SKILL)
public class ProjectExperienceSkillController extends BaseRestController<ProjectExperienceSkillDto, ProjectExperienceSkillEntity, Long> {
    public ProjectExperienceSkillController(ProjectExperienceSkillService service) {
        super(service);
    }

}
