import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "ProductRemark")
data class ProductRemark(

    @PrimaryKey(autoGenerate = true)
    var remarkId : Int,
    var productId : String,
    var remark : String,
    var createdAt : Date

)