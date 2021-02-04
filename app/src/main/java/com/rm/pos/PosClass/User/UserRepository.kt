import androidx.lifecycle.LiveData

class UserRepository (private val userDAO: UserDAO){

    val readAllData : LiveData<List<User>> = userDAO.realAllData()

    suspend fun insert_User(user: User){
        userDAO.insert_User(user)
    }

    suspend fun update_User(user: User){
        userDAO.update_User(user)
    }

    suspend fun delete_User(user: User){
        userDAO.delete_User(user)
    }


}