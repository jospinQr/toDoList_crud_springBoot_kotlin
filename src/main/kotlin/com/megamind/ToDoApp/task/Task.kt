package com.megamind.ToDoApp.task

import jakarta.persistence.*
import java.time.LocalDate


@Entity
@Table(name = "Task")
data class Task(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long =0L,
    var title:String="",
    var descritpion:String="",
    var status: String = "",
    var priority:String= "",
    var creationDate: LocalDate = LocalDate.now(),
    var completionDate: LocalDate = LocalDate.now()
)

