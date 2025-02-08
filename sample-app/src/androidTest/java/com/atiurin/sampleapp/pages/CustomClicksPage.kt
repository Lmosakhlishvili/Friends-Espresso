package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object CustomClicksPage {
    val circleTopRight: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_right) }
    val circleBottomRight: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_right) }
    val circleTopLeft: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_top_left) }
    val circleBottomLeft: Matcher<View> by lazy { ViewMatchers.withId(R.id.rB_bottom_left) }
    val customClicksPageImage:Matcher<View> by lazy { ViewMatchers.withId(R.id.imageView) }
}