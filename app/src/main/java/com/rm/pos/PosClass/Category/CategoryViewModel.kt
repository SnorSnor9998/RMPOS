package com.rm.pos.PosClass.Category

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CategoryViewModel (application: Application): AndroidViewModel(application) {

    val data : LiveData<List<Category>>
    private val repository : CategoryRepository

    init {
        val categoryDAO = CategoryDB.getDatabase(application).categoryDAO()
        repository = CategoryRepository(categoryDAO)
        data = repository.readAllData
    }

    suspend fun insert_Category(category: Category){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert_Category(category)
        }
    }

    suspend fun update_Category(category: Category){
        viewModelScope.launch(Dispatchers.IO){
            repository.update_Category(category)
        }
    }

    suspend fun delete_Category(category: Category){
        viewModelScope.launch(Dispatchers.IO){
            repository.delete_Category(category)
        }
    }


}