package org.myproject.steps;

import org.myproject.pages.SignUpPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class SignUpSteps extends ScenarioSteps {

    SignUpPage signUpPage;

	public void openRegistrationPage() {
		signUpPage.open();
		signUpPage.openRegistrationPage();
	}

	public void inputData(DataTable table) {
		signUpPage.inputData(table);
	}

	public void clickOnRegister() {
		signUpPage.clickOnRegister();
	}

	public String getMessage() {
		
		System.out.print("******************************************* ()()()()" + signUpPage.getMessage());
		return signUpPage.getMessage();
	}

   
}