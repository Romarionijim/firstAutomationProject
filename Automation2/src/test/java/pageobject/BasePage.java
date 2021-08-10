package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage  {
	WebDriver driver;
	JavascriptExecutor js;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		js=(JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void fillText(WebElement el,String text) {
		js.executeScript("arguments[0].setAttribute('style', 'border: 1px solid orange; background-color:yellow;');", el);
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		js.executeScript("arguments[0].setAttribute('style', 'border: 1px solid white; background-color:blue;');", el);
		el.click();
	}

	public String getText(WebElement el) {
		js.executeScript("arguments[0].setAttribute('style', 'border: 1px solid blue; backgrpund-color:green;');", el);
		return el.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void alertOK() {
		driver.switchTo().alert().accept();	
	}

	public void alertKeys(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();	
	}
	
	public void alertText() {
		driver.switchTo().alert().getText();
	}
}
