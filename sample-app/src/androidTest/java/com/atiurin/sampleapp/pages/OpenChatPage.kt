package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object OpenChatPage {
    val chatName: Matcher<View> by lazy { ViewMatchers.withId(R.id.toolbar_title) }
    val chatInput: Matcher<View> by lazy { ViewMatchers.withId(R.id.message_input_text) }
    val sendTextBtn: Matcher<View> by lazy {ViewMatchers.withId(R.id.send_button)}
    val messageList: Matcher<View> by lazy { ViewMatchers.withId(R.id.message_text) }

    fun getLastMessage(sentText: String): Matcher<View>? {
        return Matchers.allOf(messageList,ViewMatchers.withText(sentText))
    }
}