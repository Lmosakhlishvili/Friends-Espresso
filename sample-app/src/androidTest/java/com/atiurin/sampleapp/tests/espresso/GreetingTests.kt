package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.steps.BurgerMenuSteps
import com.atiurin.sampleapp.steps.CustomClicksSteps
import com.atiurin.sampleapp.steps.FirstPageSteps
import com.atiurin.sampleapp.steps.FriendsChatSteps
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class GreetingTests: BaseTest() {

    @get:Rule

    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun ChatwithRoss() {
        with(FirstPageSteps) {
            dashboradIsLoaded()
            openChatWith("Ross Geller")
            with(FriendsChatSteps) {
                checkChatAdressee("Ross Geller")
                greetingToFriend("Ross! There he is! How you doin?")
                sendMessage()
                ValidateSentMessage("Ross! There he is! How you doin?")

            }

        }
    }

    @Test
    fun BurgerMenuTest() {
        with(FirstPageSteps) {
            dashboradIsLoaded()
            burgerMenuOpen()

            with(BurgerMenuSteps){
                customClick()

                with(CustomClicksSteps){
                    customClicksPageIsopen()
                    clickAndValidateAllCircles()
                }


            }
        }
    }
}