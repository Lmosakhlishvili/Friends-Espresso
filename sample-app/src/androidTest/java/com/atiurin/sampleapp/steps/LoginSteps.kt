package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.data.Constants
import com.atiurin.sampleapp.pages.LoginPage
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.typeText

object LoginSteps {
    fun login() {
        LoginPage.userNameInput.typeText(Constants.LOGIN_USERNAME)
        LoginPage.passwordInput.typeText(Constants.LOGIN_PASSWORD)
        LoginPage.loginButton.click()
    }
}
