package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {
    Belly belly;

    @Before
    public void setUp() {
        this.belly = new Belly();
    }

    @Given("My belly is empty")
    public void myBellyIsEmpty() {
        belly.setBellyIsEmpty();
        assertThat(belly.isBellyIsEmpty()).isTrue();
        assertThat(belly.getCukes()).isEqualTo(0);
    }

    @Given("I eat {int} cukes")
    public void I_eat_cukes(int cukes) {
        belly.eat(cukes);
        assertThat(belly.getCukes()).isEqualTo(cukes);
        assertThat(belly.isBellyIsEmpty()).isFalse();
        assertThat(belly.isGrowl()).isFalse();
        assertThat(belly.getWaitingHour()).isEqualTo(0);
    }

    @When("I wait {int} hours")
    public void iWaitHour(int hour) {
        belly.timeToWait(hour);
        assertThat(belly.getWaitingHour()).isEqualTo(hour);
    }

    @Then("my belly should growl")
    public void myBellyShouldGrowl() {
        assertThat(belly.isGrowl()).isTrue();
    }

    @Then("my belly should not growl")
    public void myBellyShouldNotGrowl() {
        assertThat(belly.isGrowl()).isFalse();
    }
}
