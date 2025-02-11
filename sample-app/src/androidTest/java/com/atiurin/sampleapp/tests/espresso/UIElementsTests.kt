package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.StepsFor2Homework.BMenuSteps
import com.atiurin.sampleapp.StepsFor2Homework.FPageSteps
import com.atiurin.sampleapp.StepsFor2Homework.UIElementsSteps
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class UIElementsTests : BaseTest() {

    @get:Rule

    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun Burgermenu1() {
        with(FPageSteps) {
            dashboradIsLoaded()
            burgerMenuOpen()

            with(BMenuSteps) {
                uiClick()

                with(UIElementsSteps) {
                    uiElementsPageIsOpen()
                    unmarkEnableButton()
                    enableButtonValidation()
                    unmarkClickableButton()
                    clickableButtonValidation()
                    invisibleButtonClick()
                    buttonIsNoTVisibleValidation()
                }

            }
        }

    }


    @Test
    fun Burgermenu2() {
        with(FPageSteps) {
            dashboradIsLoaded()
            burgerMenuOpen()

            with(BMenuSteps) {
                uiClick()

                with(UIElementsSteps) {
                    uiElementsPageIsOpen()
                    simpleButtonClick(7) // აქ 7 იმიტომ რომ ლოადის ვალიდაციას რომ ვაკეთებ ამ ბათონზე ქლიქსაც ვაკეთებ და ჯამში8გამოდის
                    clicksCountValidation(8)
                    chooseGoneOption()
                    buttonIsNoTVisibleValidation() // ესეც აკეთებს იმის ვალიდაციას, რომ simple button is gone
                }
            }
        }
    }
}