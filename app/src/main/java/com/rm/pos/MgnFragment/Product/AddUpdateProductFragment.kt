package com.rm.pos.MgnFragment.Product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.ListFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.rm.pos.R
import kotlinx.android.synthetic.main.fragment_add_update_product.view.*


class AddUpdateProductFragment() : Fragment() {

    val args : AddUpdateProductFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_add_update_product, container, false)

        if (args.editorMode){
            view.product_lbl_oprationTitle.setText("Edit Product")
            view.product_btn_save_or_update.setText("Update")
        }


        view.product_btn_back.setOnClickListener {
            findNavController().navigate(R.id.action_addUpdateProductFragment_to_productFragment)
        }


        return view
    }


}