import androidx.lifecycle.LiveData

class TaxRepository (private val taxDAO: TaxDAO){

    val readAllData : LiveData<List<Tax>> = taxDAO.realAllData()

    suspend fun insert_Tax(tax: Tax){
        taxDAO.insert_Tax(tax)
    }

    suspend fun update_Tax(tax: Tax){
        taxDAO.update_Tax(tax)
    }

    suspend fun delete_Tax(tax: Tax){
        taxDAO.delete_Tax(tax)
    }


}