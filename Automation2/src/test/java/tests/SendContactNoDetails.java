package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class SendContactNoDetails extends BaseTest {
	
	@Test(description = "test to see if i can send an empty message")
	@Description("click on contact button in menu and send a message with empty fields")
	public void tc01_sendContactNoDetails() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.SendContact("", "", "");
		String Expected = "all fields are required";
		Assert.assertEquals(Actual, Expected);
	}
}
