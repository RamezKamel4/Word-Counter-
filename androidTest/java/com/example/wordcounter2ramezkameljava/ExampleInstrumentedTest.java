package com.example.wordcounter2ramezkameljava;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;


public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCharacterCount() {

        Espresso.onView(ViewMatchers.withId(R.id.inputEditText))
                .perform(ViewActions.typeText("Hello, this is a test string"));


        Espresso.onView(ViewMatchers.withId(R.id.button_c))
                .perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_c))
                .perform(ViewActions.click());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Espresso.onView(ViewMatchers.withId(R.id.characterCountTextView))
                .check(matches(isDisplayed()))
                .check(matches(withText("Character count: 30\nWord count: 6")));

    }


}