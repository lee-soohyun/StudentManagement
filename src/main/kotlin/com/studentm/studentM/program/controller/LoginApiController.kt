package com.studentm.studentM.program.controller

import com.studentm.studentM.program.dto.*
import com.studentm.studentM.program.service.ProgramService
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/login")
class LoginApiController(
    private val programService: ProgramService
) {
    @PostMapping
    fun postLogin(@RequestBody @Validated form: LoginForm): ResponseEntity<Any> {
        programService.save(form)

        return ApiResponse.successCreate()
    }

}