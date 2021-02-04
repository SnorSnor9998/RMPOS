import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDAO{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert_User(user: User)

    @Update
    suspend fun update_User(user: User)

    @Delete
    suspend fun delete_User(user: User)

    @Query("SELECT * FROM User")
    fun realAllData(): LiveData<List<User>>



}