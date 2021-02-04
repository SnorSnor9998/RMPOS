import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Fts4
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Cash_InOut_History")
data class Cash_InOut_History(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val posid: String,
    var amount: Int,
    var remark: String,
    val createdAt: Date,
    val userid: String,

    )