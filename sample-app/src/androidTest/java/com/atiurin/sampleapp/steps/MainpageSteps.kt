package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.MainPage
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.withTimeout
import org.junit.Assert

object MainpageSteps {
    fun dashboardIsLoaded(){
        with(MainPage){
            Assert.assertTrue(dashboard.isViewDisplayed())
        }
    }

    fun openChat(friendName: String){
        with(MainPage){
            returnFriendChat(friendName).withTimeout(2000).click()
        }
    }

    fun openMenu() {
        with(MainPage){
            menuButton.tap()
        }
    }
}