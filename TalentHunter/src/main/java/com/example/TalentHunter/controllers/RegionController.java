package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.RegionDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.RegionEntity;
import com.example.TalentHunter.services.RegionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.REGION)
public class RegionController extends BaseRestController<RegionDto, RegionEntity, Long> {
    public RegionController(RegionService service) {
        super(service);
    }

}
