package tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.sampleapp.steps.CustomClickSteps
import com.atiurin.sampleapp.steps.DashboardSteps
import com.atiurin.sampleapp.steps.OpenChatSteps
import com.atiurin.sampleapp.steps.appDrawerSteps
import com.atiurin.ultron.extensions.click
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import pages.DashboardPage


@RunWith(AndroidJUnit4::class)
@LargeTest
class GreetingTests {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)
    fun waitImplicitly(milliseconds: Long) {
        try {
            Thread.sleep(milliseconds)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    @Test
    fun sendMessageTest() {
        val dashboardPage = DashboardPage
        val dashboardSteps = DashboardSteps
        val openChatSteps = OpenChatSteps
        waitImplicitly(10000)
        dashboardPage.validateBaseLayoutVisible()
        dashboardSteps.chooseChat(Constants.NAME_GUNTHER)?.click()
        waitImplicitly(5000)
        openChatSteps.validateCorrectChatName(Constants.NAME_GUNTHER)
            .typeText(Constants.CHAT_TEXT)
            .sendText()
            .validateTextIsSend(Constants.CHAT_TEXT)
    }


    @Test
    fun customClicksTest() {
        val dashboardPage = DashboardPage
        val dashboardSteps = DashboardSteps
        val customClicksSteps = CustomClickSteps
        val appDrawerSteps = appDrawerSteps

        waitImplicitly(10000)
        dashboardPage.validateBaseLayoutVisible()
        waitImplicitly(2000)
        dashboardSteps.openAppDrawer()
        appDrawerSteps.chooseCustomClick()
        waitImplicitly(2000)
        customClicksSteps.clickBtn(CustomClicksPage.topLeftBtn)
            .clickBtn(CustomClicksPage.topRightBtn)
            .clickBtn(CustomClicksPage.bottomLeftBtn)
            .clickBtn(CustomClicksPage.bottomRightBtn)
            .validateBtnMarked(CustomClicksPage.topLeftBtn)
            .validateBtnMarked(CustomClicksPage.topRightBtn)
            .validateBtnMarked(CustomClicksPage.bottomLeftBtn)
            .validateBtnMarked(CustomClicksPage.bottomRightBtn)
    }
}
