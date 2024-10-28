package com.studentm.studentM.program.controller

import com.studentm.studentM.program.dto.NoticeDTO
import com.studentm.studentM.program.service.ProgramService
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/notice")
class NoticeApiController(
    private val programService: ProgramService
) {

    @PostMapping("/{notice_id}")
    fun postNotice(@RequestBody @Validated form: NoticeForm): ResponseEntity<Any>{
        programService.save(form)

        return ApiResponse.successCreate()
    }

    @PutMapping("/{notice_id}")
    fun putNotice(@PathVariable id: String, @RequestBody form: NoticeForm): ResponseEntity<Any>{
        programService.update(id, form)

        return ApiResponse.successUpdate()
    }


    @GetMapping
    fun getNotices(@PathVariable id: String): List<NoticeDTO> {
        return programService.getNotices(id)
    }

    @DeleteMapping("/{notice_id}")
    fun deleteNotice(@PathVariable("notice_id") id: String): ResponseEntity<Any> {
        programService.deleteNotice(id)

        return ApiResponse.successDelete()
    }
}