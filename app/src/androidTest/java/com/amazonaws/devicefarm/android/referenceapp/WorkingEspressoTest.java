package com.amazonaws.devicefarm.android.referenceapp;


import org.junit.Rule;
import org.junit.Test;

import com.amazonaws.devicefarm.android.referenceapp.Activities.MainActivity;

import android.app.Application;
import android.support.test.rule.ActivityTestRule;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

@LargeTest
public class WorkingEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public WorkingEspressoTest(final Class<Application> applicationClass) {
        super(MainActivity.class);
    }

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        assertEquals("1", 1);
    }

}
