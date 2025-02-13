package com.atiurin.sampleapp.steps

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import com.atiurin.sampleapp.R
import com.atiurin.ultron.extensions.clickCenterLeft
import com.atiurin.ultron.page.Page
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import pages.DashboardPage

object DashboardSteps : Page<DashboardPage>() {
    fun chooseChat(name: String): Matcher<View>? {
        return Matchers.allOf(ViewMatchers.withId(R.id.tv_name), ViewMatchers.withText(name))
    }

    fun openAppDrawer() {
        DashboardPage.toolBar.clickCenterLeft(20)
    }

    fun scrollToFriend(name: String): DashboardSteps {
        val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        val uiScrollable = UiScrollable(UiSelector().scrollable(true))
        uiScrollable.scrollIntoView(UiSelector().text(name))
        return this
    }
}
