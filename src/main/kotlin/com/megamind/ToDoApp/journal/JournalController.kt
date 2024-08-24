package com.megamind.ToDoApp.journal

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/journal")
class JournalController(private val journalService: JournalService) {

    @GetMapping
    fun getJournal(): List<Journal> = journalService.getJournals()

    @PostMapping
    fun saveJournal(@RequestBody journal: Journal) = journalService.saveJournal(journal)


}