package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.SkillDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.SkillEntity;
import com.example.TalentHunter.services.SkillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.SKILL)
public class SkillController extends BaseRestController<SkillDto, SkillEntity, Long> {
    public SkillController(SkillService service) {
        super(service);
    }

}
