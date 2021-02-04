import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [User::class],version = 1, exportSchema = false)
abstract class UserDB : RoomDatabase() {

    abstract fun userDAO() : UserDAO


    companion object{
        @Volatile
        private var INSTANCE : UserDB? = null

        fun getDatabase(context: Context): UserDB{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDB::class.java,
                    "RM_POS_DB" //DB name
                ).build()
                INSTANCE = instance
                return instance
            }

        }

    }

}