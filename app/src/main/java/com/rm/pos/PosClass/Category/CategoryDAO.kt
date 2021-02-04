
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CategoryDAO{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(category: Category)

    @Update
    suspend fun update(category: Category)

    @Delete
    suspend fun delete(category: Category)

    @Query("SELECT * FROM Category")
    fun realAllData(): LiveData<List<Category>>




}