package com.example.TalentHunter.services;

import com.example.TalentHunter.api.model.ContactDto;
import com.example.TalentHunter.coreLibrary.BaseService;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.EmployeeEntity;

public interface ContactService extends BaseService<ContactEntity, ContactDto, Long> {
}
