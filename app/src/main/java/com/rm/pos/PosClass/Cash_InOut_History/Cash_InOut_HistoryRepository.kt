package com.rm.rmpos.PosClass.Cash_InOut_History

import Cash_InOut_History
import androidx.lifecycle.LiveData

class Cash_InOut_HistoryRepository (private val cashInoutHistoryDAO: Cash_InOut_HistoryDAO){

    val readAllData: LiveData<List<Cash_InOut_History>> = cashInoutHistoryDAO.readAllData()

    suspend fun addCIOHistory(cashInoutHistory: Cash_InOut_History){
        cashInoutHistoryDAO.insert(cashInoutHistory)
    }

    suspend fun updateCIOHistory(cashInoutHistory: Cash_InOut_History){
        cashInoutHistoryDAO.update(cashInoutHistory)
    }

    suspend fun deleteCIOHistory(cashInoutHistory: Cash_InOut_History){
        cashInoutHistoryDAO.delete(cashInoutHistory)
    }


}