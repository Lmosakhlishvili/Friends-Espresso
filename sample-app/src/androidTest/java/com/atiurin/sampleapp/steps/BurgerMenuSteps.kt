package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.BurgerMenuPage
import com.atiurin.ultron.extensions.tap

object BurgerMenuSteps {
    fun customClick(){

    with(BurgerMenuPage){
        customClick.tap()
}}}