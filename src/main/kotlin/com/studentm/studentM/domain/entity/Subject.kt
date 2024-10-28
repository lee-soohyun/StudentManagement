package com.studentm.studentM.domain.entity

import jakarta.persistence.*

@Entity
class Subject(subjectName: String, subjectTeacher: String, subjectCredit: Int, subjectReview: Long) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    var id: String? =  null

    var subjectName: String = subjectName

    var subjectTeacher: String = subjectTeacher

    var subjectCredit: Int = subjectCredit

    var subjectReview: Long = subjectReview

    @OneToMany(targetEntity = Review::class, fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "review_id")
    var reviews: MutableList<Review> = mutableListOf()

}