package com.studentm.studentM.program.controller

import com.studentm.studentM.program.dto.*
import com.studentm.studentM.program.service.ProgramService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ProgramApiController(
    private val programService: ProgramService
) {

    @GetMapping("/manager")
    fun getManagers(): List<ManagerDTO> {
        return programService.getManagers()
    }

    @GetMapping("/notice")
    fun getNoices(): List<NoticeDTO> {
        return programService.getNotices()
    }

    @GetMapping("/student")
    fun getStudents(): List<StudentDTO> {
        return programService.getStudents()
    }

    @GetMapping("/subject")
    fun getsubjects(): List<SubjectDTO> {
        return programService.getSubjects()
    }

    @GetMapping("/review")
    fun getReviews(): List<ReviewDTO> {
        return programService.getReviews()
    }
}