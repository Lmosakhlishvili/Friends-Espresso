package pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.isViewDisplayed
import org.hamcrest.Matcher
import org.junit.Assert

object DashboardPage {

    val drawerLayoutElement: Matcher<View> by lazy { ViewMatchers.withId(R.id.drawer_layout) }
    val toolBar: Matcher<View> by lazy { ViewMatchers.withId(R.id.toolbar) }

    fun validateBaseLayoutVisible() {
        Assert.assertTrue(drawerLayoutElement.isViewDisplayed())
    }
}
