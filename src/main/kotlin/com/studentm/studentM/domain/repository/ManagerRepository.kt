package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Manager
import org.springframework.data.jpa.repository.JpaRepository

interface ManagerRepository: JpaRepository<Manager, Long> {
}