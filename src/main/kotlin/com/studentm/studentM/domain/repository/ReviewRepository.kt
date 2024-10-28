package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Notice
import com.studentm.studentM.domain.entity.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ReviewRepository: JpaRepository<Review, Long> {

}