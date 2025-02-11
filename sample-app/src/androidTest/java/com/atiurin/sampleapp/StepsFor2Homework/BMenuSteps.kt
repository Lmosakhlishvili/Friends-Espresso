package com.atiurin.sampleapp.StepsFor2Homework

import com.atiurin.sampleapp.pages.BurgerMenuPage
import com.atiurin.ultron.extensions.tap

object BMenuSteps {
    fun uiClick(){

        with(BurgerMenuPage){
            uiElementsClick.tap()
        }}}
