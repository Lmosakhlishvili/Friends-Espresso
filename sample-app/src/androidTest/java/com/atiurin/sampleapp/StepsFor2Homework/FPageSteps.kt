package com.atiurin.sampleapp.StepsFor2Homework

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.FriendsFirstPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object FPageSteps {
    fun dashboradIsLoaded(){
        with(FriendsFirstPage){
            Assert.assertTrue(dashboard.isViewDisplayed())
        }
    }


    fun burgerMenuOpen(){
        with(FriendsFirstPage){
            burgerMenu.tap()



        }
    }
}