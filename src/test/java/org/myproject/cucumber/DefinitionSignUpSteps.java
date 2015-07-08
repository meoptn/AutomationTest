package org.myproject.cucumber;


import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.myproject.steps.SignUpSteps;

public class DefinitionSignUpSteps {

	@Steps
	SignUpSteps signUpStep;

	@Given("^I go to home page$")
	public void i_go_to_home_page() throws Throwable {
		signUpStep.openRegistrationPage();
	}

	@When("^I input valid data$")
	public void i_input_valid_data(DataTable table) throws Throwable {
		signUpStep.inputData(table);
	}

	@When("^I click on register button$")
	public void i_click_on_register_button() throws Throwable {
		signUpStep.clickOnRegister();
	}

	@Then("^I want to see text \"(.*?)\"$")
	public void i_want_to_see_text(String message) throws Throwable {
		Assert.assertTrue(signUpStep.getMessage().equalsIgnoreCase(message));
	}
}
