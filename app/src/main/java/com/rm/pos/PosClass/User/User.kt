package com.rm.pos.PosClass.User

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
data class User (

    @PrimaryKey
    var userId : String,
    var userName : String,
    var userEmail : String,
    var userPassword : String,
    var accessLevel : Int,
    var active : Boolean

)