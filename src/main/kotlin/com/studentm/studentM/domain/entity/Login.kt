package com.studentm.studentM.domain.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
class Login(password: String, name: String, signupDate: LocalDate?) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: String? =  null

    var password: String = password

    var name: String = name

    var signupDate: LocalDate? = signupDate

    @OneToMany(targetEntity = Subject::class, fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "review_id")
    var subjects: MutableList<Subject> = mutableListOf()

    @OneToMany(targetEntity = Notice::class, fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "notice_id")
    var notices: MutableList<Notice> = mutableListOf()

    fun update(password: String, name: String, signupDate: LocalDate?){
        this.password = password
        this.name = name
        this.signupDate= signupDate
    }


}