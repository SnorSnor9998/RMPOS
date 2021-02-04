import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaxViewModel (application: Application) : AndroidViewModel(application){

    val data : LiveData<List<Tax>>
    private val repository : TaxRepository

    init {
        val taxDAO = TaxDB.getDatabase(application).taxDAO()
        repository = TaxRepository(taxDAO)
        data = repository.readAllData
    }

    fun insert_Tax(tax: Tax){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert_Tax(tax)
        }
    }

    fun update_Tax(tax: Tax){
        viewModelScope.launch(Dispatchers.IO){
            repository.update_Tax(tax)
        }
    }

    fun delete_Tax(tax: Tax){
        viewModelScope.launch(Dispatchers.IO){
            repository.delete_Tax(tax)
        }
    }




}