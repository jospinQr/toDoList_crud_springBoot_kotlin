package com.megamind.ToDoApp.agence

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/agence")
class AgenceController(private val agenceService: AgenceService) {


    @GetMapping
    fun getAllAgence(): List<Agence> = agenceService.findAllAgence()

}