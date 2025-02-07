package com.atiurin.sampleapp.pages
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object ClickItemsPage {
    val imgItem: Matcher<View> by lazy { ViewMatchers.withId(R.id.imageView) }
    val radioButtons = listOf(
        ViewMatchers.withId(R.id.rB_top_right),
        ViewMatchers.withId(R.id.rB_bottom_right),
        ViewMatchers.withId(R.id.rB_top_left),
        ViewMatchers.withId(R.id.rB_bottom_left)
    )
}