package com.megamind.ToDoApp.agence

import org.springframework.data.jpa.repository.JpaRepository

interface AgenceRepository : JpaRepository<Agence, String> {
}