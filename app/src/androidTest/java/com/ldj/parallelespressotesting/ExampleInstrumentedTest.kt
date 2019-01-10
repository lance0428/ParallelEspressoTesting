package com.ldj.parallelespressotesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun defaultText() {
        onView(withId(R.id.text)).check(matches(allOf(isDisplayed(), withText("Click a button"))))
    }

    @Test
    fun clickOne() {
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.text)).check(matches(allOf(isDisplayed(), withText("You clicked button 1"))))
    }

    @Test
    fun clickTwo() {
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.text)).check(matches(allOf(isDisplayed(), withText("You clicked button 2"))))
    }

    @Test
    fun clickThree() {
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.text)).check(matches(allOf(isDisplayed(), withText("You clicked button 3"))))
    }

}
