package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>