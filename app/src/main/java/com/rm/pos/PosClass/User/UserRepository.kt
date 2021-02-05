package com.rm.pos.PosClass.User

import androidx.lifecycle.LiveData

class UserRepository (private val userDAO: UserDAO) {

    val readAllData : LiveData<List<User>> = userDAO.readAllData()

    suspend fun insertUser(user: User){
        userDAO.insertUser(user)
    }

    suspend fun updateUser(user: User){
        userDAO.updateUser(user)
    }


    suspend fun deleteUser(user: User){
        userDAO.deleteUser(user)
    }


}