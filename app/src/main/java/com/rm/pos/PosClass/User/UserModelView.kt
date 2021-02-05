package com.rm.pos.PosClass.User

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserModelView (application: Application):AndroidViewModel(application) {

    val data : LiveData<List<User>>
    private val repository : UserRepository

    init {
        val userDAO = UserDB.getDatabase(application).userDAO()
        repository = UserRepository(userDAO)
        data = repository.readAllData
    }

    fun insertUser(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.insertUser(user)
        }
    }


    fun updateUser(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.updateUser(user)
        }
    }


    fun deleteUser(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteUser(user)
        }
    }




}