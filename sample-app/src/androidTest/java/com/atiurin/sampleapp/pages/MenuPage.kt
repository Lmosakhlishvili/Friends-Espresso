package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MenuPage {
    fun returnItem(item: String) : Matcher<View> {
        val menuItem: Matcher<View> by lazy {
            Matchers.allOf(
                ViewMatchers.withId(com.google.android.material.R.id.design_menu_item_text),
                ViewMatchers.withText(item)
            )
        }
        return menuItem
    }
}