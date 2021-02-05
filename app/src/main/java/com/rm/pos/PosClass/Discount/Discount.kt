package com.rm.pos.PosClass.Discount

import androidx.room.Entity
import java.util.*

@Entity(tableName = "Discount")
data class Discount(

    var discountId : String,
    var discountName : String,
    var discountCode : String,
    var startDate : Date,
    var endDate : Date,
    var counter : Int,
    var limitedQuantity : Boolean,
    var memberOnly : Boolean,
    var discountType : String, //3 option "afterspend","direct","selectedproduct"
    var minimumSpend : Int

)