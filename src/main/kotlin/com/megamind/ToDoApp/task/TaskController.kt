package com.megamind.ToDoApp.task

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/task")
class TaskController(private val service: TaskService) {

    @GetMapping
    fun getAllTask(): List<Task> = service.getAllTask()

    @GetMapping("/{id}")
    fun getTaskById(@PathVariable id: Long) = service.getTaskById(id)

    @PostMapping
    fun addTask(@RequestBody task: Task): Task = service.addTask(task)

    @PutMapping("/{id}")
    fun upDatetask(@PathVariable id: Long, @RequestBody task: Task): Task {
        return service.updateTask(id, task)
    }


    @DeleteMapping("/{id}")
    fun deleteTask(@PathVariable id:Long){
        service.deleteTask(id)
    }
}