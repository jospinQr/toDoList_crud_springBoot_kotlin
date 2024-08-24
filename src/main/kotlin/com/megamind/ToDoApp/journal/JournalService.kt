package com.megamind.ToDoApp.journal

import org.springframework.stereotype.Service

@Service
class JournalService(private val repository: JournalRepository) {

    fun getJournals(): List<Journal> = repository.findAll()
    fun saveJournal(journal: Journal) = repository.save(journal)

}