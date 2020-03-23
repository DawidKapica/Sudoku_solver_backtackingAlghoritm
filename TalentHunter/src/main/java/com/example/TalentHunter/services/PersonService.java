package com.example.TalentHunter.services;

import com.example.TalentHunter.api.model.PersonDto;
import com.example.TalentHunter.coreLibrary.BaseService;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.PersonEntity;

public interface PersonService extends BaseService<PersonEntity, PersonDto, Long> {
}
