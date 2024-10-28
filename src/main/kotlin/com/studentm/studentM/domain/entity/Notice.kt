package com.studentm.studentM.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn

@Entity
class Notice(noticeList: String, noticeRegister: String, noticeUpdate: String, noticeDelete: String) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    var id: Long? =  null

    var noticeList: String = noticeList

    var noticeRegister: String = noticeRegister

    var noticeUpdate: String = noticeUpdate

    var  noticeDelete: String = noticeDelete

    fun update(noticeList: String, noticeRegister: String, noticeUpdate: String, noticeDelete: String) {
        this.noticeList = noticeList
        this.noticeRegister = noticeRegister
        this.noticeUpdate = noticeUpdate
        this.noticeDelete = noticeDelete
    }
}