package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long>