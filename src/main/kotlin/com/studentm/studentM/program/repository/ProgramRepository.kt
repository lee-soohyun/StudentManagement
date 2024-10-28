package com.studentm.studentM.program.repository

import com.studentm.studentM.domain.entity.Login
import com.studentm.studentM.domain.entity.Notice
import com.studentm.studentM.domain.entity.Review
import com.studentm.studentM.domain.entity.Subject
import com.studentm.studentM.domain.repository.LoginRepository
import com.studentm.studentM.domain.repository.NoticeRepository
import com.studentm.studentM.domain.repository.ReviewRepository
import com.studentm.studentM.domain.repository.SubjectRepository
import org.springframework.stereotype.Repository

@Repository
class ProgramRepository(
    private val loginRepository: LoginRepository,
    private val noticeRepository: NoticeRepository,
    private val reviewRepository: ReviewRepository,
    private val subjectRepository: SubjectRepository
) {

    fun getActiveLogins(): List<Login> {
        return loginRepository.findAll()
    }

    fun getActiveNotices(): List<Notice> {
        return noticeRepository.findAll()
    }

    fun getActiveReviews(): List<Review> {
        return reviewRepository.findAll()
    }

    fun getActiveSubjects(): List<Subject> {
        return subjectRepository.findAll()
    }
}