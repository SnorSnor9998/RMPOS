package com.rm.pos.PosClass.Category

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CategoryDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert_Category(category: Category)

    @Update
    suspend fun update_Category(category: Category)

    @Delete
    suspend fun delete_Category(category: Category)

    @Query("SELECT * FROM Category")
    fun readAllData() : LiveData<List<Category>>


}