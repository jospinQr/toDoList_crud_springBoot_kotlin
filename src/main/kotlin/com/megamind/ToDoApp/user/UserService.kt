package com.megamind.ToDoApp.user


import org.springframework.stereotype.Service
import java.util.Optional


@Service
class UserService(private val repository: UserRepository)  {


    fun findAllUser(): List<User> = repository.findAll()

   // fun finUserByMail(email: String): User = repository.findByEmail(email)!!

    fun findUserById(id:Long) : Optional<User?> = repository.findById(id)

    fun save(user: User): User {

//        val existingUser = repository.findById(user.userName)

        return if (user == null) {
            repository.save<User>(user)
        } else {
            throw Exception("Utilisateur exist")
        }
    }
    fun deleteById(id:Long)  = repository.deleteById(id)
//    override fun loadUserByUsername(username: String?): UserDetails? {
//        TODO("Not yet implemented")
//    }


}


