package com.megamind.ToDoApp.task


import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class TaskService(private val taskRepository: TaskRepository) {

    fun getAllTask(): List<Task> = taskRepository.findAll()

    fun getTaskById(id:Long) :Task {

        return taskRepository.findById(id).orElseThrow(){
            NoSuchElementException("task $id est introuvable")
        }
    }


    fun addTask(task: Task): Task = taskRepository.save(task)

    @Transactional
    fun updateTask(id: Long, task: Task): Task {

        val existingTask = taskRepository.findById(id).orElseThrow() {
            NoSuchElementException("task $id est introuvable")
        }

        existingTask.apply {
            descritpion = task.descritpion
            title = task.title
            creationDate = task.creationDate
            completionDate =task.completionDate
            status=task.status
            priority=task.priority
        }

        return taskRepository.save(existingTask)
    }

    fun deleteTask(id:Long) {

        val existingTask = taskRepository.findById(id).orElseThrow() {
            NoSuchElementException("task $id est introuvable")
        }

         taskRepository.deleteById(existingTask.id)

    }


}