package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object FriendsFirstPage {
    val dashboard: Matcher<View> by lazy {withId(R.id.recycler_friends) }
    val ross: Matcher<View> by lazy { Matchers.allOf(withId(R.id.tv_name), withText("Ross Geller"))}
    val burgerMenu:Matcher<View> by lazy { withId(R.id.toolbar)}


}