package com.studentm.studentM.domain.repository

import com.studentm.studentM.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>