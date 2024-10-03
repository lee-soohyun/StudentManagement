package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>