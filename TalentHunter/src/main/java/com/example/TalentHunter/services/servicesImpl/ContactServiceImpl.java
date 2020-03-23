package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.ContactDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.ContactEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.ContactService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl extends BaseServiceImpl<ContactEntity, ContactDto, Long> implements ContactService {

    public ContactServiceImpl(
            BaseRepository<ContactEntity, Long> repository, BaseMapper<ContactDto, ContactEntity> mapper) {
        super(repository, mapper);
    }
}
