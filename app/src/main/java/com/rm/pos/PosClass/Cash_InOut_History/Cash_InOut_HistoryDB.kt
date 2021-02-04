package com.rm.rmpos.PosClass.Cash_InOut_History

import Cash_InOut_History
import Converters
import android.content.Context
import androidx.room.*



@Database(entities = [Cash_InOut_History::class],version = 1, exportSchema = false)
abstract class Cash_InOut_HistoryDB : RoomDatabase() {

    abstract fun historyDao() : Cash_InOut_HistoryDAO


    companion object{
        @Volatile
        private var INSTANCE : Cash_InOut_HistoryDB? = null

        fun getDatabase(context: Context): Cash_InOut_HistoryDB{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    Cash_InOut_HistoryDB::class.java,
                    "RM_POS_DB" //DB name
                ).build()
                INSTANCE = instance
                return instance
            }

        }

    }

}