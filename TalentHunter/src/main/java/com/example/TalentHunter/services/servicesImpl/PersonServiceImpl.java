package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.PersonDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.PersonEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.PersonService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends BaseServiceImpl<PersonEntity, PersonDto, Long> implements PersonService {

    public PersonServiceImpl(
            BaseRepository<PersonEntity, Long> repository, BaseMapper<PersonDto, PersonEntity> mapper) {
        super(repository, mapper);
    }
}
