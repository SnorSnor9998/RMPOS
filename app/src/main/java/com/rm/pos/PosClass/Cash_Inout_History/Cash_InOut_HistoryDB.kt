package com.rm.rmpos.PosClass.Cash_InOut_History


import android.content.Context
import androidx.room.*
import com.rm.pos.PosClass.Cash_Inout_History.Cash_InOut_History
import com.rm.pos.PosClass.DBConverter


@Database(entities = [Cash_InOut_History::class],version = 1, exportSchema = false)
@TypeConverters(DBConverter::class)
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