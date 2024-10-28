package com.studentm.studentM.domain.entity

import jakarta.persistence.*

@Entity
class Review(reviewList: String, reviewRegister: String, reviewUpdate: String, reviewDelete: String, subject: Subject) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    var id: Long? =  null

    var reviewList: String = reviewList

    var reviewRegister: String = reviewRegister

    var reviewUpdate: String = reviewUpdate

    var reviewDelete: String = reviewDelete

    @ManyToOne(targetEntity = Subject::class, fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    var subject: Subject = subject

    fun update(reviewList: String, reviewRegister: String, reviewUpdate: String, reviewDelete: String) {
        this.reviewList = reviewList
        this.reviewRegister = reviewRegister
        this.reviewUpdate = reviewUpdate
        this.reviewDelete = reviewDelete
    }

}