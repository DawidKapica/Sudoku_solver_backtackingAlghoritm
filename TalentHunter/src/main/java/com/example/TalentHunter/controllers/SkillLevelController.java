package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.SKILL_LEVEL)
public class SkillLevelController extends BaseRestController<SkillLevelDto, SkillLevelEntity, Long> {
    public SkillLevelController(SkillLevelService service) {
        super(service);
    }

}
