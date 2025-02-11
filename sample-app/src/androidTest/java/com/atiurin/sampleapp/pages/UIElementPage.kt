package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.*
import com.atiurin.sampleapp.R
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.Matchers.containsString
import org.hamcrest.Matchers.instanceOf

object UIElementPage {
    val simpleButton: Matcher<View> by lazy { Matchers.allOf(withId(R.id.button1))}
    val EnableButton: Matcher<View> by lazy { withId(R.id.checkbox_enable) }
    val ClickableButton: Matcher<View> by lazy { withId(R.id.checkbox_clickable) }
    val invButton: Matcher<View> by lazy { withId(R.id.radio_invisible) }
    val clicksStatus: Matcher<View> by lazy { withId(R.id.last_event_status) }
    val radioGoneButton = withId(R.id.radio_gone)}



