package com.studentm.studentM.program.dto

import com.studentm.studentM.domain.entity.Login

data class LoginDTO(
    val password: String,
    val name: String,
    val signupdate: String?
) {

}