package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.PositionDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.PositionEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.PositionService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl extends BaseServiceImpl<PositionEntity, PositionDto, Long> implements PositionService {

    public PositionServiceImpl(
            BaseRepository<PositionEntity, Long> repository, BaseMapper<PositionDto, PositionEntity> mapper) {
        super(repository, mapper);
    }
}
