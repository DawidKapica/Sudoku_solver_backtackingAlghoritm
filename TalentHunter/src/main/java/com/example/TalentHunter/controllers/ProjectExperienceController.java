package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.ProjectExperienceDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.ProjectExperienceEntity;
import com.example.TalentHunter.services.ProjectExperienceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.PROJECT_EXPERIENCES)
public class ProjectExperienceController extends BaseRestController<ProjectExperienceDto, ProjectExperienceEntity, Long> {
    public ProjectExperienceController(ProjectExperienceService service) {
        super(service);
    }

}
