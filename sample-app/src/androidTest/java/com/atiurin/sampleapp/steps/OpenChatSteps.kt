package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.OpenChatPage
import com.atiurin.sampleapp.tests.espresso.BaseTestClass
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.clickCenterRight
import com.atiurin.ultron.extensions.typeText
import com.atiurin.ultron.page.Page
import org.junit.Assert

object OpenChatSteps : Page<OpenChatPage>() {
    fun validateCorrectChatName(name:String): OpenChatSteps {
        Assert.assertEquals(name,OpenChatPage.chatName.getText())
        return this
    }

    fun typeText(text:String): OpenChatSteps {
        OpenChatPage.chatInput.typeText(text)
        return this;
    }

    fun sendText(): OpenChatSteps {
        OpenChatPage.sendTextBtn.click()
        return this
    }

    fun validateTextIsSend(text: String): OpenChatSteps{
        OpenChatPage.getLastMessage(text)?.let { Assert.assertTrue(it.isViewDisplayed()) }
        return this
    }

    fun clearChatHistory(): OpenChatSteps {
        OpenChatPage.toolBar.clickCenterRight(-20)
        onView(withText("Clear history")).click()
        return this
    }

}