package com.rm.pos.PosClass.ProductRemark

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "ProductRemark")
data class ProductRemark(

    @PrimaryKey(autoGenerate = true)
    var remarkId: Int,
    var productId: Int,
    var remark: String,
    var createdAt: Date

)