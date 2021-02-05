package com.rm.rmpos.PosClass.Cash_InOut_History


import androidx.lifecycle.LiveData
import com.rm.pos.PosClass.Cash_Inout_History.Cash_InOut_History

class Cash_InOut_HistoryRepository (private val cashInoutHistoryDAO: Cash_InOut_HistoryDAO){

    val readAllData: LiveData<List<Cash_InOut_History>> = cashInoutHistoryDAO.readAllData()

    suspend fun addCIOHistory(cashInoutHistory: Cash_InOut_History){
        cashInoutHistoryDAO.insert_CIOHistory(cashInoutHistory)
    }

    suspend fun updateCIOHistory(cashInoutHistory: Cash_InOut_History){
        cashInoutHistoryDAO.update_CIOHistory(cashInoutHistory)
    }

    suspend fun deleteCIOHistory(cashInoutHistory: Cash_InOut_History){
        cashInoutHistoryDAO.delete_CIOHistory(cashInoutHistory)
    }


}