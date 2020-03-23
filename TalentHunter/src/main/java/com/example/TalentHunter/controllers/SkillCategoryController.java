package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.SkillCategoryDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.SkillCategoryEntity;
import com.example.TalentHunter.services.SkillCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.SKILL_CATEGORY)
public class SkillCategoryController extends BaseRestController<SkillCategoryDto, SkillCategoryEntity, Long> {
    public SkillCategoryController(SkillCategoryService service) {
        super(service);
    }

}
