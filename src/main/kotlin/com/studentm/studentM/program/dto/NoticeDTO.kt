package com.studentm.studentM.program.dto

import com.studentm.studentM.domain.entity.Notice

data class NoticeDTO(
    val noticeList: String,
    val noticeRegister: String,
    val noticeUpdate: String,
    val noticeDelete: String
) {

}