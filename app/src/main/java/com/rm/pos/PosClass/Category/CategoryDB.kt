package com.rm.pos.PosClass.Category

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rm.pos.PosClass.Converter
import com.rm.rmpos.PosClass.Cash_InOut_History.Cash_InOut_HistoryDB


@Database(entities = [Category::class],version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class CategoryDB:RoomDatabase() {

    abstract fun categoryDAO() : CategoryDAO

    companion object{
        @Volatile
        private var INSTANCE : CategoryDB? = null

        fun getDatabase(context: Context): CategoryDB {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CategoryDB::class.java,
                    "RM_POS_DB" //DB name
                ).build()
                INSTANCE = instance
                return instance
            }

        }

    }


}