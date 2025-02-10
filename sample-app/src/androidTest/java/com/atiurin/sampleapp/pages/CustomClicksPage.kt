package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.ultron.page.Page
import org.hamcrest.Matcher

object CustomClicksPage {
    val bottomLeftBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_left) }
    val bottomRightBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_right) }
    val topLeftBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_left) }
    val topRightBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_right) }
}
