package com.megamind.ToDoApp.user

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("api/v1/user")
class UserController(val userService: UserService) {

    @GetMapping
    fun findAllUsers(): List<User> =
        userService.findAllUser()

    @PostMapping
    fun createUser(@RequestBody user: User): User =
        userService.save(user)


//    @GetMapping("/email/{email}")
//    fun findUserByMail(@PathVariable email: String): User =
//        userService.finUserByMail(email)

    @GetMapping("/id/{id}")
    fun findUserById(@PathVariable id:Long) : Optional<User?> = userService.findUserById(id)

    @DeleteMapping("/{id}")
    fun deleteUserById(@PathVariable id: Long) =
        userService.deleteById(id)

}