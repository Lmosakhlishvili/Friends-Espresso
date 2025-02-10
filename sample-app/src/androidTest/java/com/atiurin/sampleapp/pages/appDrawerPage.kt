package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object appDrawerPage {
    val customClickBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.custom_clicks_nav_item) }
}