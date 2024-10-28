package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Notice
import com.studentm.studentM.domain.entity.Subject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface NoticeRepository: JpaRepository<Notice, Long> {

    @Query("select e from Experience e join fetch e.details where e.id = :id")
    override fun findById(id: Long): Optional<Notice>
}