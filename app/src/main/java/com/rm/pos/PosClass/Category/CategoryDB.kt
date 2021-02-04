import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Category::class],version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class CategoryDB : RoomDatabase() {

    abstract fun categoryDAO() : CategoryDAO


    companion object{
        @Volatile
        private var INSTANCE : CategoryDB? = null

        fun getDatabase(context: Context): CategoryDB{
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