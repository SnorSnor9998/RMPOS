import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
data class User(

    @PrimaryKey(autoGenerate = true)
    var userId: Int,
    var userName: String,
    var userEmail: String,
    var userPassword: String,
    var accessLevel: Int,
    var active: Boolean

)