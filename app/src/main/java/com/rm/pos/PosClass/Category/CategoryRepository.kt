import androidx.lifecycle.LiveData

class CategoryRepository (private val categoryDAO: CategoryDAO){

    val readAllData : LiveData<List<Category>> = categoryDAO.realAllData()

    suspend fun insert_Category(category: Category){
        categoryDAO.insert_Category(category)
    }

    suspend fun update_Category(category: Category){
        categoryDAO.update_Category(category)
    }

    suspend fun delete_Category(category: Category){
        categoryDAO.delete_Category(category)
    }



}