package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.PositionDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.PositionEntity;
import com.example.TalentHunter.services.PositionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.POSITION)
public class PositionController extends BaseRestController<PositionDto, PositionEntity, Long> {
    public PositionController(PositionService service) {
        super(service);
    }

}
