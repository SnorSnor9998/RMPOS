import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tax")
data class Tax(

    @PrimaryKey(autoGenerate = true)
    var taxId: Int,
    var taxName: String,
    var taxRate: Int,
    var default: Boolean,
)