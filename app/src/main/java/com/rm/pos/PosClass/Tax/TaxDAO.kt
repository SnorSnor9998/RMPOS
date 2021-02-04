import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaxDAO{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert_Tax(tax: Tax)

    @Update
    suspend fun update_Tax(tax: Tax)

    @Delete
    suspend fun delete_Tax(tax: Tax)

    @Query("SELECT * FROM Tax")
    fun realAllData(): LiveData<List<Tax>>


}