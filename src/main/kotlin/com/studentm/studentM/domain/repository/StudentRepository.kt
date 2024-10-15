package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long> {
}