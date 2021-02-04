import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel (application: Application): AndroidViewModel(application){


    val data : LiveData<List<User>>
    private val repository : UserRepository

    init {
        val userDAO = UserDB.getDatabase(application).userDAO()
        repository = UserRepository(userDAO)
        data = repository.readAllData
    }

    fun insert_User(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert_User(user)
        }
    }

    fun update_User(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.update_User(user)
        }
    }

    fun delete_User(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.delete_User(user)
        }
    }



}