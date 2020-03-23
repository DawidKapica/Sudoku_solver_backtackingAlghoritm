package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.PersonDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.PersonEntity;
import com.example.TalentHunter.services.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.PERSON)
public class PersonController extends BaseRestController<PersonDto, PersonEntity, Long> {
    public PersonController(PersonService service) {
        super(service);
    }

}
