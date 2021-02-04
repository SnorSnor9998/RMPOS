package com.rm.pos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EndOfDayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_of_day)
    }

    fun nav_click(view: View) {
        when (view.id) {
            R.id.aty_eod_nav_orderhistory -> startActivity(Intent(this, OrderHistoryActivity::class.java))
            R.id.aty_eod_nav_cashinout -> startActivity(Intent(this, CashInOutActivity::class.java))
            R.id.aty_eod_nav_pos -> startActivity(Intent(this, PosActivity::class.java))
            R.id.aty_eod_nav_management -> startActivity(Intent(this, ManagementActivity::class.java))
            R.id.aty_eod_nav_setting -> startActivity(Intent(this, SettingsActivity::class.java))
        }

        overridePendingTransition(0, 0)
    }
}