package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.MenuPage

object MenuSteps {
    fun clickCustomClick(item: String){
        with(MenuPage){
            returnItem(item).tap()
        }

    }
}