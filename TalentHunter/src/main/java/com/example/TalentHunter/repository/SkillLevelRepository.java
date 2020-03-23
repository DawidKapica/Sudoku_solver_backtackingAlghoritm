package com.example.TalentHunter.repository;

import com.example.TalentHunter.coreLibrary.BaseRepository;
import com.example.TalentHunter.entity.SkillLevelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillLevelRepository extends BaseRepository<SkillLevelEntity, Long> {
}
