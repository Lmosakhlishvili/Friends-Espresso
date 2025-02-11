package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.FriendsFirstPage
import com.atiurin.ultron.extensions.clickTopLeft
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object FirstPageSteps {
    fun dashboradIsLoaded(){
        with(FriendsFirstPage){
            Assert.assertTrue(dashboard.isViewDisplayed())
        }
    }
    fun openChatWith (name : String){
        with(FriendsFirstPage){
            ross.tap()
        }
    }

    fun burgerMenuOpen(){
        with(FriendsFirstPage){
            burgerMenu.tap()
            burgerMenu.clickTopLeft()


        }
    }
}