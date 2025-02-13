package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.pages.OpenChatPage
import com.atiurin.sampleapp.steps.DashboardSteps
import com.atiurin.sampleapp.steps.LoginSteps
import com.atiurin.sampleapp.steps.OpenChatSteps
import com.atiurin.ultron.extensions.click
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import pages.DashboardPage

@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@LargeTest
class ILoveMyFriendsTests : BaseTestClass() {
    val dashBoardPage = DashboardPage
    val openChatPage = OpenChatPage

    val dashBoardSteps = DashboardSteps
    val openChatSteps = OpenChatSteps
    val loginSteps = LoginSteps

    @Test
    fun a_sendTextToEmmet() {
        loginSteps.login()
        waitImplicitly(2000)
        dashBoardSteps.scrollToFriend(Constants.NAME_EMMET_BROWN)
            .chooseChat(Constants.NAME_EMMET_BROWN)
            ?.click()
        waitImplicitly(3000)
        openChatSteps.validateCorrectChatName(Constants.NAME_EMMET_BROWN)
            .typeText(Constants.TEXT_TO_EMMET)
            .sendText()
            .validateTextIsSend(Constants.TEXT_TO_EMMET)
    }

    @Test
    fun b_sendTextToFriend17() {
        waitImplicitly(2000)
        dashBoardSteps.scrollToFriend(Constants.NAME_FRIEND_17)
            .chooseChat(Constants.NAME_FRIEND_17)
            ?.click()
        waitImplicitly(2000)
        openChatSteps.validateCorrectChatName(Constants.NAME_FRIEND_17)
            .clearChatHistory()
            .sendText()
            .typeText(Constants.TEXT_TO_FRIEND_17)
            .sendText()
            .validateTextIsSend(Constants.TEXT_TO_FRIEND_17)
    }

    // friend25 does not exist so test fails
    @Test
    fun c_sendTextToFriend25() {
        waitImplicitly(2000)
        dashBoardSteps.scrollToFriend(Constants.NAME_FRIEND_25)
            .chooseChat(Constants.NAME_FRIEND_25)
            ?.click()
        waitImplicitly(2000)
    }
}
