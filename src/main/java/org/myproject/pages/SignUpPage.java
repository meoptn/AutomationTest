package org.myproject.pages;


import net.thucydides.core.annotations.DefaultUrl;



import cucumber.api.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.List;



@DefaultUrl("http://live.guru99.com/")
public class SignUpPage extends PageObject {

    @FindBy(xpath="//*[@id='header']/div/div[2]/div/a/span[2]")
    private WebElementFacade btnAccount;

    @FindBy(xpath="//*[@id='header-account']/div/ul/li[5]/a")
    private WebElementFacade lkRegister;
    
    @FindBy(id="firstname")
    private WebElementFacade txtFirstName;
    
    @FindBy(id="lastname")
    private WebElementFacade txtLastName;
    
    @FindBy(id="email_address")
    private WebElementFacade txtEmail;
    
    @FindBy(id="password")
    private WebElementFacade txtPassword;
    
    @FindBy(id="confirmation")
    private WebElementFacade txtConfirmation;
    
    @FindBy(xpath = "//*[@id='form-validate']/div[2]/button")
    private WebElementFacade btnRegister;
    
    //p[class='welcome-msg']
    @FindBy(css = "p[class='welcome-msg']")
    private WebElementFacade lbWelcome;
    
    
    public void openRegistrationPage() {
    	btnAccount.click();
    	lkRegister.click();
    }


	public void inputData(DataTable table) {
		List<List<String>> data = table.raw();
		txtFirstName.sendKeys(data.get(1).get(1));
		txtLastName.sendKeys(data.get(2).get(1));
		txtEmail.sendKeys(data.get(3).get(1));
		txtPassword.sendKeys(data.get(4).get(1));
		txtConfirmation.sendKeys(data.get(5).get(1));
	}


	public void clickOnRegister() {
		btnRegister.click();
	}


	public String getMessage() {
		return lbWelcome.getText();
	}
    
}