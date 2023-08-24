package com.example.a310_rondayview;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.action.ViewActions.click;

import junit.framework.TestCase;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FragmentHomeTest extends TestCase {

    @Before
    public void launchFragment() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void testSwipeEvents() {
        // Swipe through events by clicking the interestedButton
        for (int i = 0; i < 3; i++) {
            Espresso.onView(ViewMatchers.withId(R.id.interestedButton)).perform(click());
        }
    }
}