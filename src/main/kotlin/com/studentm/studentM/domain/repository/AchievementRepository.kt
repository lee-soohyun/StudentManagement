package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long>