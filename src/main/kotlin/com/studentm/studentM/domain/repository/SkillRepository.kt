package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>