import androidx.lifecycle.LiveData

class CategoryRepository (private val categoryDAO: CategoryDAO){

    val readAllData : LiveData<List<Category>> = categoryDAO.realAllData()

    suspend fun insert(category: Category){
        categoryDAO.insert(category)
    }

    suspend fun update(category: Category){
        categoryDAO.update(category)
    }

    suspend fun delete(category: Category){
        categoryDAO.delete(category)
    }



}