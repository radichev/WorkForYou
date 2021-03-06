package com.radichev.workforyou.service;

import com.radichev.workforyou.domain.entity.SkillLevel;
import com.radichev.workforyou.model.dtos.SkillDto.SkillLevelDto;

import java.util.List;

public interface SkillLevelService {
    void initSkillLevels();

    List<SkillLevelDto> findAllSkillLevels();

    SkillLevel findSkillLevelById(String skillLevelId);
}
