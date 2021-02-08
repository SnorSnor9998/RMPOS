package com.rm.pos.MgnFragment.Tax

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.rm.pos.R
import com.rm.pos.databinding.FragmentTaxBinding
import kotlinx.android.synthetic.main.dialog_edit_tax.*
import kotlinx.android.synthetic.main.dialog_new_tax.view.*
import kotlinx.android.synthetic.main.fragment_edit_product.*
import kotlinx.android.synthetic.main.fragment_tax.view.*

class TaxFragment : Fragment() {

    private lateinit var binding: FragmentTaxBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tax, container, false)

//        binding = FragmentTaxBinding.inflate(layoutInflater) //this for activity
        binding = FragmentTaxBinding.bind(view) //for fragment

        binding.taxBtnNew.setOnClickListener { newtax() }
        binding.taxBtnEdit.setOnClickListener { edittax() }
        binding.taxBtnDelete.setOnClickListener { deletetax() }
        binding.taxBtnRefresh.setOnClickListener { refresh() }


        return view
    }


    private fun refresh(){

    }

    private fun newtax(){
        val mDialogView = LayoutInflater.from(this.context).inflate(R.layout.dialog_new_tax, null)
        val mBuilder = AlertDialog.Builder(this.context).setView(mDialogView)
        val mAlertDialog = mBuilder.show()
        mAlertDialog.setCanceledOnTouchOutside(false)

        mDialogView.addtax_btn_cancel.setOnClickListener {
            mAlertDialog.dismiss() //close dialog
        }

        mDialogView.addtax_btn_add.setOnClickListener {

        }

    }

    private fun edittax(){
        val mDialogView = LayoutInflater.from(this.context).inflate(R.layout.dialog_edit_tax, null)
        val mBuilder = AlertDialog.Builder(this.context).setView(mDialogView)
        val mAlertDialog = mBuilder.show()
        mAlertDialog.setCanceledOnTouchOutside(false)

        mAlertDialog.edittax_btn_cancel.setOnClickListener {
            mAlertDialog.dismiss()
        }

        mAlertDialog.edittax_btn_save.setOnClickListener {

        }


    }

    private fun deletetax(){
//        Toast.makeText(this.context,"HELLO?",Toast.LENGTH_SHORT).show()
        Log.d("HELLO?","GG IS THIS WORK?")
    }


}