package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object ChatWithFriendsPage {

    val friendName: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.tv_name),
            ViewMatchers.withText("Monica Geller")
        )
    }

    val messageInputText: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.message_input_text),
            ViewMatchers.withText("Enter text")
        )
    }
    val textToSend: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.message_input_text)
        )
    }
    val sendBtn: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.send_button)
        )
    }

    val messageText: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.message_text),
            ViewMatchers.withText("Kak dela deliodela?")
        )
    }
}
