package com.atiurin.sampleapp.steps


import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.pages.ChatPage
import com.atiurin.ultron.core.espresso.recyclerview.UltronRecyclerViewItem
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object ChatPageSteps {
    fun checkChatIsCorrect(friendName: String){
        with(ChatPage){
            Assert.assertEquals(friendName, actualFriendName.getText())
        }
    }

    fun inputMessage(message: String){
        with(ChatPage){
            inputMessageText.typeText(message)
        }
    }

    fun sendMessage(){
        with(ChatPage){
            sendMessageBtn.tap()
        }
    }



    class ChatRecyclerItem : UltronRecyclerViewItem(){
        val text by lazy { getChild(ViewMatchers.withId(R.id.message_text)) }
    }

    private fun getListItem(position: Int): ChatRecyclerItem {
        with(ChatPage){
            return messagesList.getItem(position)
        }
    }

    fun assertMessageIsSent(expectedMessage: String) = apply {
        with(ChatPage){
            val actualMessage = getListItem(messagesList.getSize() - 1).text.getText()
            Assert.assertEquals(expectedMessage, actualMessage)
        }
    }


}