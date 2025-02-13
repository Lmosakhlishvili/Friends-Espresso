package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.activity.MainActivity
import org.junit.Rule

open class BaseTestClass {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    fun waitImplicitly(milliseconds: Long) {
        try {
            Thread.sleep(milliseconds)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}
