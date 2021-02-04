package com.rm.rmpos.PosClass.Cash_InOut_History

import Cash_InOut_History
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface Cash_InOut_HistoryDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(cashInoutHistory: Cash_InOut_History)

    @Update
    suspend fun update(cashInoutHistory: Cash_InOut_History)

    @Delete
    suspend fun delete(cashInoutHistory: Cash_InOut_History)

    @Query("DELETE FROM Cash_InOut_History")
    suspend fun deleteAll_CashInOutHistory()

    @Query("SELECT * FROM Cash_InOut_History ORDER BY id ASC")
    fun readAllData(): LiveData<List<Cash_InOut_History>>



}