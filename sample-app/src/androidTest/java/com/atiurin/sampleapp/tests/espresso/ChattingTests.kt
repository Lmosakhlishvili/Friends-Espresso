package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.steps.ChatWithFriendsSteps
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.ChatWithFriendsPage
import com.atiurin.ultron.extensions.tap
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun textWithMyFriend() {
        with(ChatWithFriendsPage) {
            val typedText = "Kak dela deliodela?"
            friendName.isViewDisplayed()
            friendName.tap()
            messageInputText.isViewDisplayed()
            ChatWithFriendsSteps.typeText(typedText)
            sendBtn.tap()
            messageText.isViewDisplayed()
        }
    }
}
