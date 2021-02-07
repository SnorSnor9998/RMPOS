package com.rm.pos.PosClass.ProductRemark

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProductRemarkDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert_ProductRemark(productRemark: ProductRemark)

    @Update
    suspend fun update_ProductRemark(productRemark: ProductRemark)

    @Delete
    suspend fun delete_ProductRemark(productRemark: ProductRemark)

    @Query("SELECT * FROM ProductRemark")
    fun readAllData() : LiveData<List<ProductRemark>>



}