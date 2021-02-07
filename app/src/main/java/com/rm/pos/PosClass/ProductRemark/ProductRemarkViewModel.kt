package com.rm.pos.PosClass.ProductRemark

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductRemarkViewModel (application: Application): AndroidViewModel(application) {

    val data : LiveData<List<ProductRemark>>
    private val repository: ProductRemarkRepository


    init {
        val productRemarkDAO = ProductRemarkDB.getDatabase(application).productRemarkDAO()
        repository = ProductRemarkRepository(productRemarkDAO)
        data = repository.readAllData
    }

    fun insert_ProductRemark(productRemark: ProductRemark){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert_ProductRemark(productRemark)
        }
    }

    fun update_ProductRemark(productRemark: ProductRemark){
        viewModelScope.launch(Dispatchers.IO){
            repository.update_ProductRemark(productRemark)
        }
    }

    fun delete_ProductRemark(productRemark: ProductRemark){
        viewModelScope.launch(Dispatchers.IO){
            repository.delete_ProductRemark(productRemark)
        }
    }


}