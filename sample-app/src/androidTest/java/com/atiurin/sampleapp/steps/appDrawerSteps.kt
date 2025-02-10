package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.appDrawerPage
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.page.Page

object appDrawerSteps : Page<appDrawerPage>() {
    fun chooseCustomClick(){
        appDrawerPage.customClickBtn.click()
    }
}