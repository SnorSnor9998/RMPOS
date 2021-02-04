import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Tax::class],version = 1, exportSchema = false)
abstract class TaxDB : RoomDatabase() {

    abstract fun taxDAO() : TaxDAO


    companion object{
        @Volatile
        private var INSTANCE : TaxDB? = null

        fun getDatabase(context: Context): TaxDB{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TaxDB::class.java,
                    "RM_POS_DB" //DB name
                ).build()
                INSTANCE = instance
                return instance
            }

        }

    }

}