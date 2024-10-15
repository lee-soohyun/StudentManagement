package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Subject
import org.springframework.data.jpa.repository.JpaRepository

interface SubjectRepository: JpaRepository<Subject, Long> {
}