package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("The test started");
    }

    @After
    public void tearDown() {
        System.out.println("The test finished");
    }
}
