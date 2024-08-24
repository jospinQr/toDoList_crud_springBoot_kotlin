package com.megamind.ToDoApp.agence

import org.springframework.stereotype.Service


@Service
class AgenceService (private val agenceRepository: AgenceRepository){



    fun findAllAgence (): List<Agence> = agenceRepository.findAll()


}