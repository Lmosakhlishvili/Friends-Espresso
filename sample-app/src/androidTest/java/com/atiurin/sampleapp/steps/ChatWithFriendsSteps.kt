package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.ChatWithFriendsPage

object ChatWithFriendsSteps {
    fun typeText(text: String) {
        ChatWithFriendsPage.textToSend.typeText(text)
    }
}
