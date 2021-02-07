package com.rm.pos.PosClass.ProductRemark

import androidx.lifecycle.LiveData

class ProductRemarkRepository (private val productRemarkDAO: ProductRemarkDAO) {

    val readAllData : LiveData<List<ProductRemark>> = productRemarkDAO.readAllData()

    suspend fun insert_ProductRemark(productRemark: ProductRemark){
        productRemarkDAO.insert_ProductRemark(productRemark)
    }

    suspend fun update_ProductRemark(productRemark: ProductRemark){
        productRemarkDAO.update_ProductRemark(productRemark)
    }

    suspend fun delete_ProductRemark(productRemark: ProductRemark){
        productRemarkDAO.delete_ProductRemark(productRemark)
    }


}