package com.megamind.ToDoApp.agence

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table
data class Agence(

    @Id
    val codag: String="",
    val nomag: String="",
)
