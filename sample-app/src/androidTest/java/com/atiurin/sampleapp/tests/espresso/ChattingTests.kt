package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.pages.ChatWithFriendsPage
import com.atiurin.sampleapp.steps.ChatWithFriendsSteps
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

    @Test
    fun textEmmetBrown() {
        findFriend()
        with(ChatWithFriendsPage) {
            val typedText2 = "Wazzzuuup?"
            emmetBrown.tap()
            messageInputText.isViewDisplayed()
            ChatWithFriendsSteps.typeText(typedText2)
            sendBtn.tap()
            messageText.isViewDisplayed()

        }
    }
    @Test
    fun textFriend(){
        findFriend()
        with(ChatWithFriendsPage){
            val typedText3 = "Wazzzuuup?"
            friend17.tap()
            messageInputText.isViewDisplayed()
            ChatWithFriendsSteps.typeText(typedText3)
            sendBtn.tap()
            messageInputText.isViewDisplayed()
        }


    }

    fun swipeDown() {
        swiper(500, 100, 20)
    }

    fun findFriend() {
        while (!ChatWithFriendsPage.emmetBrown.isViewDisplayed()) {
            swipeDown()
        }
    }
}
