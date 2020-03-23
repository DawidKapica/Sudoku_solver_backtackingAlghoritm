package com.example.TalentHunter.services.servicesImpl;

import com.example.TalentHunter.api.model.EmployeeDto;
import com.example.TalentHunter.api.model.SkillCategoryDto;
import com.example.TalentHunter.api.model.SkillLevelDto;
import com.example.TalentHunter.coreLibrary.BaseMapper;
import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.coreLibrary.BaseServiceImpl;
import com.example.TalentHunter.entity.EmployeeEntity;
import com.example.TalentHunter.entity.SkillCategoryEntity;
import com.example.TalentHunter.entity.SkillLevelEntity;
import com.example.TalentHunter.services.SkillCategoryService;
import com.example.TalentHunter.services.SkillLevelService;
import org.springframework.stereotype.Service;

@Service
public class SkillCategoryServiceImpl extends BaseServiceImpl<SkillCategoryEntity, SkillCategoryDto, Long> implements SkillCategoryService {

    public SkillCategoryServiceImpl(
            BaseRepository<SkillCategoryEntity, Long> repository, BaseMapper<SkillCategoryDto, SkillCategoryEntity> mapper) {
        super(repository, mapper);
    }
}
