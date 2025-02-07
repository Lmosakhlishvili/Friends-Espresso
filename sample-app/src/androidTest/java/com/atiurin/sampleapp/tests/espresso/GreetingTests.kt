package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.pages.ClickItemsPage.radioButtons
import com.atiurin.sampleapp.steps.ChatPageSteps
import com.atiurin.sampleapp.steps.ClickItemsPageSteps
import com.atiurin.sampleapp.steps.MainpageSteps
import com.atiurin.sampleapp.steps.MenuSteps
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class GreetingTests : BaseTest() {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test1(){
        with(Constants){
            with(MainpageSteps){
                dashboardIsLoaded()
                openChat(RACHEL_GREEN)
            }
            with(ChatPageSteps){
                checkChatIsCorrect(RACHEL_GREEN)
                inputMessage(MESSAGE)
                sendMessage()
                assertMessageIsSent(MESSAGE)
            }
        }

    }

    @Test
    fun test2(){
        with(Constants){
            with(MainpageSteps){
                dashboardIsLoaded()
                openMenu()
            }
            with(MenuSteps){
                clickCustomClick(CUSTOM_CLICKS_BUTTON)
            }
            with(ClickItemsPageSteps){
                pageIsDisplayed()
                clickOnButtons(radioButtons)
                validateButtons(radioButtons)
            }
        }
    }
}