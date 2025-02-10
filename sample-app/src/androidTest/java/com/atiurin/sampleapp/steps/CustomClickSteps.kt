package com.atiurin.sampleapp.steps

import android.view.View
import androidx.test.espresso.Espresso.onView
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.ultron.page.Page
import org.hamcrest.Matcher
import org.junit.Assert

object CustomClickSteps : Page<CustomClicksPage>() {
    fun clickBtn(buttonMatcher: Matcher<View>): CustomClickSteps {
        onView(buttonMatcher).tap()
        return this
    }
    fun validateBtnMarked(buttonMatcher: Matcher<View>): CustomClickSteps {
        Assert.assertTrue(buttonMatcher.isChecked())
        return this
    }
}