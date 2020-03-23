package com.example.TalentHunter.controllers;

import com.example.TalentHunter.api.model.ContactDto;
import com.example.TalentHunter.coreLibrary.BaseRestController;
import com.example.TalentHunter.coreLibrary.RestMappings;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.services.ContactService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.CONTACT)
public class ContactController extends BaseRestController<ContactDto, ContactEntity, Long> {
    public ContactController(ContactService service) {
        super(service);
    }

}
