package com.megamind.ToDoApp.journal


import jakarta.persistence.Entity

import jakarta.persistence.Id
import jakarta.persistence.Lob
import jakarta.persistence.Table



@Entity
@Table(name = "journal")
data class Journal(

    @Id
    val codeCaisse: String,
    @Lob
    val valuer: String,
    val date: String,
    val statut: Int = 1,


)
