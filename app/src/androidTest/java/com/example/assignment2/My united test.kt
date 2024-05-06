package com.example.assignment2

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test

@Suppress("UNREACHABLE_CODE")
class SecondActivity {

    @get:Rule
    val activityRule = ActivityScenarioRule()

    private fun ActivityScenarioRule(): Any {

        return TODO("Provide the return value")
    }

    @Test
    fun testFeedButton() {
        // Check initial values
        onView(withId(R.id.textView2)).check(matches(withText("0")))
        onView(withId(R.id.textView3)).check(matches(withText("0")))
        onView(withId(R.id.textView4)).check(matches(withText("0")))

        // Click the feed button
        onView(withId(R.id.button2)).perform(click())

        // Check values after feeding
        onView(withId(R.id.textView2)).check(matches(withText("10")))
        onView(withId(R.id.textView3)).check(matches(withText("10")))
        onView(withId(R.id.textView4)).check(matches(withText("5")))
    }

    @Test
    fun testCleanButton() {
        // Check initial values
        onView(withId(R.id.textView2)).check(matches(withText("0")))
        onView(withId(R.id.textView3)).check(matches(withText("0")))
        onView(withId(R.id.textView4)).check(matches(withText("0")))

        // Click the clean button
        onView(withId(R.id.button3)).perform(click())

        // Check values after cleaning
        onView(withId(R.id.textView2)).check(matches(withText("0")))
        onView(withId(R.id.textView3)).check(matches(withText("10")))
        onView(withId(R.id.textView4)).check(matches(withText("10")))
    }

    @Test
    fun testPlayButton() {
        // Check initial values
        onView(withId(R.id.textView2)).check(matches(withText("0")))
        onView(withId(R.id.textView3)).check(matches(withText("0")))
        onView(withId(R.id.textView4)).check(matches(withText("0")))

        // Click the play button
        onView(withId(R.id.button4)).perform(click())

        // Check values after playing
        onView(withId(R.id.textView2)).check(matches(withText("5")))
        onView(withId(R.id.textView3)).check(matches(withText("5")))
        onView(withId(R.id.textView4)).check(matches(withText("10")))
    }
}
