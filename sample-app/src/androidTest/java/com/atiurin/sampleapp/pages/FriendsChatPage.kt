package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object FriendsChatPage {
    val chatTitle: Matcher<View> by lazy { withId(R.id.toolbar_title) }
    val messageInputField: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val sendBtn: Matcher<View> by lazy { withId(R.id.send_button) }
    val myGreetingText: Matcher<View> by lazy { withId(R.id.message_text) }

}