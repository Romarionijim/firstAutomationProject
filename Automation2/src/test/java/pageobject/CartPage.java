package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}

	//click on place order and fill all the details without choosing product
	public void placeOrder(String name, String country, String city, String credit, String month, String year) {
		sleep(8000);
		click(driver.findElement(By.cssSelector(".btn.btn-success")));
		sleep(8000);
		//fill name 
		fillText(driver.findElement(By.cssSelector("#name")), name);
		//fill country
		fillText(driver.findElement(By.cssSelector("#country")), country);
		//fill city
		fillText(driver.findElement(By.cssSelector("#city")), city);
		//fill credit card
		fillText(driver.findElement(By.cssSelector("#card")), credit);
		//fill month
		fillText(driver.findElement(By.cssSelector("#month")), month);
		//fill year
		fillText(driver.findElement(By.cssSelector("#year")), year);
		//click on purchase
		click(driver.findElement(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary")));
		//click on ok button in purchase confirmation
		sleep(4000);
		click(driver.findElement(By.cssSelector(".confirm.btn.btn-lg.btn-primary")));
	}

	public void deleteItemFromCart() {
		sleep(6000);
		click(driver.findElement(By.cssSelector("#tbodyid > tr > td:nth-child(4) > a")));
	}

	//click on place order and dont fill anything and then click on purchase
	public String placeOrderNoDetails(String name, String country, String city, String credit, String month, String year) {
		sleep(8000);
		click(driver.findElement(By.cssSelector(".btn.btn-success")));
		sleep(8000);
		//fill name 
		fillText(driver.findElement(By.cssSelector("#name")), name);
		//fill country
		fillText(driver.findElement(By.cssSelector("#country")), country);
		//fill city
		fillText(driver.findElement(By.cssSelector("#city")), city);
		//fill credit card
		fillText(driver.findElement(By.cssSelector("#card")), credit);
		//fill month
		fillText(driver.findElement(By.cssSelector("#month")), month);
		//fill year
		fillText(driver.findElement(By.cssSelector("#year")), year);
		//click on purchase
		click(driver.findElement(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary")));
		sleep(8000);
		String note = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//close
		sleep(4000);
		click(driver.findElement(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-secondary")));
		return note;
	}
}


