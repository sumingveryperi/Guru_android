package com.example.guru_project

import java.io.Serializable

class User(
    // 회원 정보를 저장하기 위한 클래스 User
    var name: String,
    var id: String,
    var pw: String

): Serializable {
    constructor(): this("","","")

}