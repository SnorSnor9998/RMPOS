package com.rm.pos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_management)
    }

    fun nav_click(view: View) {
        when (view.id) {
            R.id.aty_mgn_nav_orderhistory -> startActivity(Intent(this, OrderHistoryActivity::class.java))
            R.id.aty_mgn_nav_cashinout -> startActivity(Intent(this, CashInOutActivity::class.java))
            R.id.aty_mgn_nav_endofday -> startActivity(Intent(this, EndOfDayActivity::class.java))
            R.id.aty_mgn_nav_pos -> startActivity(Intent(this, PosActivity::class.java))
            R.id.aty_mgn_nav_setting -> startActivity(Intent(this, SettingsActivity::class.java))
        }

        overridePendingTransition(0, 0)
    }
}