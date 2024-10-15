package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Review
import org.springframework.data.jpa.repository.JpaRepository

interface ReviewRepository: JpaRepository<Review, Long> {
}