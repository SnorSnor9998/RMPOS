package com.rm.pos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.rm.pos.PosClass.Address
import com.rm.pos.PosClass.Cash_Inout_History.Cash_InOut_History
import com.rm.rmpos.PosClass.Cash_InOut_History.Cash_InOut_HistoryViewModel
import kotlinx.android.synthetic.main.activity_pos.*
import java.util.*

class PosActivity : AppCompatActivity() {


    private lateinit var mCash_InOut_HistoryViewModel: Cash_InOut_HistoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pos)


        mCash_InOut_HistoryViewModel = ViewModelProvider(this).get(Cash_InOut_HistoryViewModel::class.java)

        val address = Address(
            "GG",
            "GG",
            "GGCITY",
            "MY",
            "98200",
            "STATE"
        )
        val now = Calendar.getInstance().time
        val cio = Cash_InOut_History(0,1001,111000,"?",now,"ADMIN")
        button.setOnClickListener {
            mCash_InOut_HistoryViewModel.insert_CIOHistory(cio)
        }


    }

    fun nav_click(view: View) {
        when (view.id) {
            R.id.aty_pos_nav_orderhistory -> startActivity(
                Intent(
                    this,
                    OrderHistoryActivity::class.java
                )
            )
            R.id.aty_pos_nav_cashinout -> startActivity(Intent(this, CashInOutActivity::class.java))
            R.id.aty_pos_nav_endofday -> startActivity(Intent(this, EndOfDayActivity::class.java))
            R.id.aty_pos_nav_management -> startActivity(
                Intent(
                    this,
                    ManagementActivity::class.java
                )
            )
            R.id.aty_pos_nav_setting -> startActivity(Intent(this, SettingsActivity::class.java))
        }
        overridePendingTransition(0, 0)
    }
}