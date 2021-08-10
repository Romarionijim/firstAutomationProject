package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	//add the product to cart in the product page
	public String addToCart() {
		//add the item from the item to cart
		sleep(4000);
		click(driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")));
		sleep(4000);
		//alert
		String msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return msg;
	}
}
