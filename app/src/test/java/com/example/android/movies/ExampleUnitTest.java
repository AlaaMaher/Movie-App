package com.example.android.movies;

import org.junit.Test;
import android.app.Application;
import android.test.ApplicationTestCase;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    public class ApplicationTest extends ApplicationTestCase<Application>
    {
            public ApplicationTest()
                    {
                        super(Application.class);
            }
}