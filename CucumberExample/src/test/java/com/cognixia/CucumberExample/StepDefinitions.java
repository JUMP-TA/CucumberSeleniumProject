package com.cognixia.CucumberExample;

import io.cucumber.java.en.*;

import static org.assertj.core.api.Assertions.assertThat;

class DayOfTheWeek {
	static String getDay(String today) {
		return "Friday".equals(today) ? "Yes!" : "No";
	}
}

public class StepDefinitions {
	private String today;
	private String actualAnswer;
	
	@Given("today is {string}")
	public void today_is(String today) {
		this.today = today;
	}
	
	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		actualAnswer = DayOfTheWeek.getDay(today);
	}
	
	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
	    // Write code here that turns the phrase above into concrete actions
	    assertThat(actualAnswer).isEqualTo(expectedAnswer);
	}

//	@Given("today is Thursday")
//	public void today_is_thursday() {
//	    // Write code here that turns the phrase above into concrete actions
//	    today = "Thursday";
//	}
//	@Given("today is Friday")
//	public void today_is_Friday() {
//		today = "Friday";
//	}
//	@When("I ask whether it's Friday yet")
//	public void i_ask_whether_it_s_friday_yet() {
//	    // Write code here that turns the phrase above into concrete actions
//	    actualAnswer = DayOfTheWeek.getDay(today);
//	}
//	@Then("I should be told {string}")
//	public void i_should_be_told(String expectedAnswer) {
//	    // Write code here that turns the phrase above into concrete actions
//	    assertThat(actualAnswer).isEqualTo(expectedAnswer);
//	}
}
