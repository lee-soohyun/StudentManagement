package com.studentm.studentM.program.controller

import com.studentm.studentM.program.dto.SubjectDTO
import com.studentm.studentM.program.service.ProgramService
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/subject")
class SubjectApiController(
    private val programService: ProgramService
) {
    @PostMapping("/{subject_id}")
    fun postSubject(@RequestBody @Validated form: SubjectForm): ResponseEntity<Any> {
        programService.save(form)

        return ApiResponse.successCreate()
    }

    @PutMapping("/{subject_id}")
    fun putSubject(@PathVariable id: String, @RequestBody form: SubjectForm): ResponseEntity<Any> {
        programService.update(id, form)

        return ApiResponse.successUpdate()
    }


    @GetMapping("/{subject_id}")
    fun getSubjects(@PathVariable id: String): List<SubjectDTO> {
        return programService.getSubjects(id)
    }

}