package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class NextAndPreviousButtons extends BaseTest {
	
	
	@Test(description = "click on the next button on the bottom of the page")
	@Description("Testing the next button at the bottom of the home page to make sure that it does display the next page")
	public void tc01_homePageNextButtonFunction() {
		//test to see if the next button functions
		HomePage hp = new HomePage(driver);
		hp.nextButton();
	}
	
	@Test(description = "previous button funcionality")
	@Description("click on the previous button after clicking on the next button at the bottom of the homepage")
	public void tc02_homePagePreviousButtonFunction() {
		//test to see if the previous button functions
		HomePage hp = new HomePage(driver);
		hp.previousButton();
	}
}
