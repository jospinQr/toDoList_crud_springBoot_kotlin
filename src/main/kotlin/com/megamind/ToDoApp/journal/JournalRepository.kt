package com.megamind.ToDoApp.journal

import org.springframework.data.jpa.repository.JpaRepository

interface JournalRepository : JpaRepository<Journal, Long>
