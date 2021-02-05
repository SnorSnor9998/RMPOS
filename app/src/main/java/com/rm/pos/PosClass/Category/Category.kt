package com.rm.pos.PosClass.Category

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Category")
data class Category(

    @PrimaryKey(autoGenerate = true)
    var categoryId: Int,
    var categoryName: String
)