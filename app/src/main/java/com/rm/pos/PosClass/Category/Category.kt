import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Category")
data class Category(

    @PrimaryKey(autoGenerate = true)
    var categoryId: Int,
    var categoryName: String

)