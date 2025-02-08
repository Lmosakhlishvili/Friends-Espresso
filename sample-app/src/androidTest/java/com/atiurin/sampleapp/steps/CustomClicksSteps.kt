package com.atiurin.sampleapp.steps

import android.view.View
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.CustomClicksPage

import com.atiurin.ultron.extensions.tap
import org.hamcrest.Matcher
import org.junit.Assert

object CustomClicksSteps {

fun customClicksPageIsopen(){
    with(CustomClicksPage){
        customClicksPageImage.isViewDisplayed()

    }
}

        fun clickCircle(circle: Matcher<View>) {
            circle.tap()
        }
        fun assertCircleIsChecked(circle: Matcher<View>) {
            Assert.assertTrue(circle.isChecked())
        }
    fun clickAndValidateAllCircles() {
        with(CustomClicksPage) {
            clickCircle(circleTopRight)
            clickCircle(circleBottomRight)
            clickCircle(circleTopLeft)
            clickCircle(circleBottomLeft)

            assertCircleIsChecked(circleTopRight)
            assertCircleIsChecked(circleBottomRight)
            assertCircleIsChecked(circleTopLeft)
            assertCircleIsChecked(circleBottomLeft)
}}}