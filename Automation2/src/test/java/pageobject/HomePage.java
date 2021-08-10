package pageobject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy (css="#recipient-email")
	private WebElement nameField;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	//press on contact button menu and send your contact info
	public String SendContact(String text, String name, String msg) {
		click(driver.findElement(By.cssSelector("#navbarExample > ul > li:nth-child(2) > a")));
		sleep(8000);
		fillText(nameField, text);
		fillText(driver.findElement(By.cssSelector("#recipient-name")), name);
		fillText(driver.findElement(By.cssSelector("#message-text")), msg);
		click(driver.findElement(By.cssSelector("[onclick='send()']")));
		sleep(2000);
		String pop = driver.switchTo().alert().getText();
		alertOK();
		return pop;
		
	}

	public void homeButton() {
		click(driver.findElement(By.cssSelector(".nav-item.active a")));
	}

	public void logoHomeButton() {
		click(driver.findElement(By.cssSelector(".container #nava")));
	}

	/*
	 * Open about us window in menu and then play the video in it , enter full screen,
	 * exit full screen , stop video and close.
	 */
	public void aboutUsButton() {
		//play video
		click(driver.findElement(By.cssSelector("#navbarExample > ul > li:nth-child(3) > a")));
		sleep(4000);
		click(driver.findElement(By.cssSelector(".vjs-big-play-button")));
		//enter full screen button
		sleep(2000);
		click(driver.findElement(By.cssSelector(".vjs-fullscreen-control.vjs-control.vjs-button")));
		//exit full screen
		sleep(2000);
		click(driver.findElement(By.cssSelector(".vjs-fullscreen-control.vjs-control.vjs-button")));
		//stop\pause video
		click(driver.findElement(By.cssSelector(".vjs-play-control.vjs-control.vjs-button.vjs-playing")));
		//close "about us" window
		click(driver.findElement(By.cssSelector("#videoModal > div > div > div.modal-footer > button")));
	}

	//cart button menu
	public void clickOnCart() {
		sleep(8000);
		click(driver.findElement(By.cssSelector("#cartur")));
	}

	//login button menu
	public void login(String user, String password) {
		click(driver.findElement(By.cssSelector("#login2")));
		sleep(4000);
		//fill user name and password
		fillText(driver.findElement(By.cssSelector("#loginusername")), user);
		fillText(driver.findElement(By.cssSelector("#loginpassword")), password);
		click(driver.findElement(By.cssSelector("[onclick='logIn()']")));
	}

	//negative login test - login fail process
	public String loginFailed(String name, String text) {
		click(driver.findElement(By.cssSelector("#login2")));
		sleep(4000);
		//negative method on login process
		fillText(driver.findElement(By.cssSelector("#loginusername")), name);
		fillText(driver.findElement(By.cssSelector("#loginpassword")), text);
		click(driver.findElement(By.cssSelector("[onclick='logIn()']")));
		//alert
		sleep(2000);
		String msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//close window
		sleep(4000);
		click(driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-secondary")));
		return msg;
	}

	//sign up process - click sign up button and fill info
	public String signUp(String username, String pass) {
		click(driver.findElement(By.cssSelector("#signin2")));
		sleep(6000);
		//create username and password
		fillText(driver.findElement(By.cssSelector("#sign-username")), username);
		fillText(driver.findElement(By.cssSelector("#sign-password")), pass);
		click(driver.findElement(By.cssSelector("[onclick='register()']")));
		//alert
		sleep(6000);
		String message = driver.switchTo().alert().getText();
		alertOK();
		return message;
	}

	//negative sign up tests - fail the sign up process
	public String signUpFailed(String username, String pass) {
		click(driver.findElement(By.cssSelector("#signin2")));
		sleep(8000);
		//create username and password
		fillText(driver.findElement(By.cssSelector("#sign-username")), username);
		fillText(driver.findElement(By.cssSelector("#sign-password")), pass);
		click(driver.findElement(By.cssSelector("[onclick='register()']")));
		//alert
		sleep(2000);
		String msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//close window
		click(driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-secondary")));
		return msg;
	}

	//pick item from category list 
	public void chooseProductsFromCategories(String name) {
		sleep(6000);
		List<WebElement> list = driver.findElements(By.cssSelector(".hrefch"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {
				el.click();
				break;
			}
		}
	}

	//pick item from another category list
	public void chooseSecondProduct(String name) {
		sleep(8000);
		List<WebElement> list = driver.findElements(By.cssSelector(".hrefch"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {
				el.click();
				break;
			}
		}
	}

	public void logOut() {
		sleep(8000);
		click(driver.findElement(By.cssSelector("#logout2")));
	}

	//next button on the bottom of the home page
	public void nextButton() {
		sleep(4000);
		click(driver.findElement(By.cssSelector("li #next2")));
	}

	//previous button on the bottom of the home page
	public void previousButton() {
		sleep(4000);
		click(driver.findElement(By.cssSelector("#prev2")));
	}

	//click on the right arrows of the pictures in the center of the page
	public void centerRightSlideImages() {
		//click to slide 3 times to the right side
		sleep(1000);
		for (int i = 0; i < 3; i++) {
			sleep(1000);
			click(driver.findElement(By.cssSelector(".carousel-control-next-icon")));
		}
	}

	//click on the left arrows of the pictures in the center of the page
	public void centerLeftSlideImages() {
		sleep(1000);
		for (int i = 0; i < 3; i++) {
			//click to slide 3 times to the left side
			sleep(1000);
			click(driver.findElement(By.cssSelector(".carousel-control-prev-icon")));
		}
	}

	//phone category products - home page
	public void phoneButton(String name) {
		sleep(4000);
		List<WebElement> list = driver.findElements(By.cssSelector(".list-group .list-group-item"));
		for (WebElement option : list) {
			if (option.getText().equalsIgnoreCase(name)) {
				option.click();
				break;
			}
		}
	}

	//laptop category products - home page
	public void laptopButton(String name) {
		sleep(4000);
		List<WebElement> list = driver.findElements(By.cssSelector(".list-group .list-group-item"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {
				el.click();
				break;
			}
		}
	}
}

