package com.studentm.studentM.program.controller

import com.studentm.studentM.program.dto.ReviewDTO
import com.studentm.studentM.program.service.ProgramService
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/review")
class ReviewApiController(
    private val programService: ProgramService
) {
    @PostMapping("/{review_id}")
    fun postReview(@RequestBody @Validated form: ReviewForm): ResponseEntity<Any> {
        programService.save(form)

        return ApiResponse.successCreate()
    }

    @PutMapping("/{review_id}")
    fun putReview(@PathVariable id: String, @RequestBody form: ReviewForm): ResponseEntity<Any> {
        programService.update(id, form)

        return ApiResponse.successUpdate()
    }


    @GetMapping
    fun getReviews(@PathVariable id: String): List<ReviewDTO> {
        return programService.getReviews(id)
    }

    @DeleteMapping("/{review_id}")
    fun deleteReview(@PathVariable("review_id") id: String): ResponseEntity<Any> {
        programService.deleteReview(id)

        return ApiResponse.successDelete()
    }
}