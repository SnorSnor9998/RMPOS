package com.rm.pos


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import java.util.*

class MainActivity : AppCompatActivity() {

//    private lateinit var mStock_HistoryViewModel : Stock_HistoryViewModel
//    private lateinit var mCategoryViewModel: CategoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mCategoryViewModel = ViewModelProvider(this).get(CategoryViewModel::class.java)
//
//        val cat = Category(UUID.randomUUID(),"GG")
//
//        mCategoryViewModel.insert_Category(cat)


//        val uuid = UUID.randomUUID()
//        val now = Calendar.getInstance().time
//        val stock = Stock_History(uuid,"DOC",1001,"DOC",now,1,20,30,now)
//
//        mStock_HistoryViewModel = ViewModelProvider(this).get(Stock_HistoryViewModel::class.java)
//
//        mStock_HistoryViewModel.insert_StockHistory(stock)


    }
}