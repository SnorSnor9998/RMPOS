package com.rm.pos.MgnFragment.Product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rm.pos.R
import kotlinx.android.synthetic.main.fragment_product.view.*


class ProductFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_product, container, false)

        view.mgn_product_btn_newproduct.setOnClickListener {
            val action = ProductFragmentDirections.actionProductFragmentToAddUpdateProductFragment(false) //editor mode false, layout will set to add product
            findNavController().navigate(action)
        }

        view.mgn_product_btn_editproduct.setOnClickListener {
            val action = ProductFragmentDirections.actionProductFragmentToAddUpdateProductFragment(true)
            findNavController().navigate(action)
        }



        return view
    }




}