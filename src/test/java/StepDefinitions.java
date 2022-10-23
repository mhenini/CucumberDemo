import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private Weekday today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void todayIsSunday() {
        today = new Weekday("Sunday");
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        today = new Weekday("Friday");
    }

    @Given("today is {string}")
    public void todayIs(String day) {
        today = new Weekday(day);
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = today.isItFriday();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
