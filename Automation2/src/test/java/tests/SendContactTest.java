package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class SendContactTest extends BaseTest {
	
	@Test(description = "send a message via contact button")
	@Description("click on the contact button in menu , fill in the details and send your message")
	public void tc01_sendContactMsg() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.SendContact("email11@gmail.com", "tester", "this is my message to this website");
		String Expected = "Thanks for the message!!";
		Assert.assertEquals(Actual, Expected);
	}
}
