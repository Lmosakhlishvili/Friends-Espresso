package com.atiurin.sampleapp.StepsFor2Homework

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.UIElementPage

import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.isNotSelected
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.textContains
import org.junit.Assert.assertTrue

object UIElementsSteps {
    fun uiElementsPageIsOpen() {
        with(UIElementPage) {
            simpleButton.tap()
            assertTrue(simpleButton.isViewDisplayed())
        }

    }

    fun unmarkEnableButton() {
        with(UIElementPage) {
            EnableButton.tap()
        }
    }
    fun enableButtonValidation() {
        with(UIElementPage) {
            EnableButton.isNotSelected()

        }
    }

    fun unmarkClickableButton() {
        with(UIElementPage) {
            ClickableButton.tap()
        }
    }


    fun clickableButtonValidation() {
        with(UIElementPage) {
            ClickableButton.isNotSelected()

        }
    }

    fun invisibleButtonClick() {
        with(UIElementPage) {
            invButton.tap()
        }
    }

    fun buttonIsNoTVisibleValidation() {
        with(UIElementPage) {
            simpleButton.isNotDisplayed()

        }
    }

    fun simpleButtonClick(times: Int) {
        with(UIElementPage) {
            repeat(times) {
                simpleButton.tap()
            }
        }
    }

    fun clicksCountValidation(count: Int) {
        with(UIElementPage) {
            clicksStatus.textContains("Click $count")
        }
    }

    fun chooseGoneOption() {
        with(UIElementPage) {
            radioGoneButton.tap()

        }
    }


}