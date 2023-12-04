package com.dicoding.courseschedule.ui.home

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.ui.add.AddActivity
import org.junit.After

@RunWith(AndroidJUnit4::class)
class HomeActivityTest{
    @Before
    fun setup() {
        ActivityScenario.launch(HomeActivity::class.java)
        Intents.init()
    }
    @After
    fun destroy(){
        Intents.release()
    }
    @Test
    fun testAddCourseButton() {
        Espresso.onView(withId(R.id.action_add)).perform(ViewActions.click())
        Intents.intended(IntentMatchers.hasComponent(AddActivity::class.java.name))
    }
}