package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.ExperienceDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.ExperienceEntity;
import com.example.TalentHunter.services.ExperienceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.EXPERIENCE)
public class ExperienceController extends BaseRestController<ExperienceDto, ExperienceEntity, Long> {
    public ExperienceController(ExperienceService service) {
        super(service);
    }

}
