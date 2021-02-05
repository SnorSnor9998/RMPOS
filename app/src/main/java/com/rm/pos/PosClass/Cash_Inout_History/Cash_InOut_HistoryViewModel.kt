package com.rm.rmpos.PosClass.Cash_InOut_History

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.rm.pos.PosClass.Cash_Inout_History.Cash_InOut_History
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Cash_InOut_HistoryViewModel (application: Application):AndroidViewModel(application){

    val data: LiveData<List<Cash_InOut_History>>
    private val repository : Cash_InOut_HistoryRepository

    init {
        val cashInoutHistoryDAO = Cash_InOut_HistoryDB.getDatabase(application).historyDao()
        repository = Cash_InOut_HistoryRepository(cashInoutHistoryDAO)
        data = repository.readAllData
    }

    fun insert_CIOHistory(cashInoutHistory: Cash_InOut_History){
        viewModelScope.launch(Dispatchers.IO){
            repository.addCIOHistory(cashInoutHistory)
        }
    }

    fun update_CIOHistory(cashInoutHistory: Cash_InOut_History){
        viewModelScope.launch(Dispatchers.IO){
            repository.updateCIOHistory(cashInoutHistory)
        }
    }

    fun delete_CIOHistory(cashInoutHistory: Cash_InOut_History){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteCIOHistory(cashInoutHistory)
        }
    }


}