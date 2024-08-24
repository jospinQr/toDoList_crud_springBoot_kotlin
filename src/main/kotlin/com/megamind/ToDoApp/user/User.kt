package com.megamind.ToDoApp.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table



@Entity
@Table(name="user")
data class User  (

    @Id
    val codUser: String="",
    val userName: String="",
    val passWord: String=""
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    val id:Long=0,
//    var userName :String="",
//    var email: String="",
//    var role: String="USER",
//    var passWord:String="",

)