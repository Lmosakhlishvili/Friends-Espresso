package com.atiurin.sampleapp.steps

import android.view.View
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.ClickItemsPage.imgItem
import org.hamcrest.Matcher
import org.junit.Assert
import org.junit.Assert.assertTrue

object ClickItemsPageSteps {
    fun pageIsDisplayed(){
        assertTrue(imgItem.isViewDisplayed())
    }
    fun clickOnButtons(buttons: List<Matcher<View>>) {
        buttons.forEach { button ->
            button.tap()
        }
    }

    fun validateButtons(buttons: List<Matcher<View>>) {
        buttons.forEach { button ->
            Assert.assertTrue(button.isChecked())
        }
    }



}