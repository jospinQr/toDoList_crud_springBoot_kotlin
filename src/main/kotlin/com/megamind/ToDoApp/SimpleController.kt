package com.megamind.ToDoApp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SimpleController {

    @GetMapping("/")
    fun gretting() : List<String> = listOf("Hello","world")
}