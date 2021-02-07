package com.rm.pos.PosClass.ProductRemark

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rm.pos.PosClass.DBConverter

@Database(entities = [ProductRemark::class],version = 1,exportSchema = false)
@TypeConverters(DBConverter::class)
abstract class ProductRemarkDB : RoomDatabase(){

    abstract fun productRemarkDAO() : ProductRemarkDAO

    companion object{
        @Volatile
        private var INSTANCE : ProductRemarkDB? = null

        fun getDatabase(context: Context): ProductRemarkDB {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ProductRemarkDB::class.java,
                    "RM_POS_DB" //DB name
                ).build()
                INSTANCE = instance
                return instance
            }

        }
    }

}