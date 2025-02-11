package com.atiurin.sampleapp.steps


import androidx.test.espresso.matcher.ViewMatchers.withId

import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.pages.ChatPage

import com.atiurin.sampleapp.pages.FriendsChatPage

import com.atiurin.ultron.core.espresso.recyclerview.UltronRecyclerViewItem
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object FriendsChatSteps {
    fun checkChatAdressee(name: String) {
        with(FriendsChatPage) {
            Assert.assertEquals(name, chatTitle.getText())

        }
    }

    fun greetingToFriend(message: String) {
        with(FriendsChatPage) {
            messageInputField.typeText(message)
        }
    }

    fun sendMessage() {
        with(FriendsChatPage) {

            sendBtn.tap()

        }
    }

    private fun getListItemAtPosition(position: Int): ChatRecyclerItem {
        with(ChatPage){
            return messagesList.getItem(position)
        }
    }

    class ChatRecyclerItem : UltronRecyclerViewItem(){
        val text by lazy { getChild(withId(R.id.message_text)) }
    }

    fun ValidateSentMessage(expectedMessage: String) = apply {
        with(ChatPage){
            val actualMessage = getListItemAtPosition(messagesList.getSize() - 1).text.getText()
            Assert.assertEquals(expectedMessage, actualMessage)
        }
    }
}



