package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Notice
import org.springframework.data.jpa.repository.JpaRepository

interface LoginRepository: JpaRepository<Notice, Long> {
}