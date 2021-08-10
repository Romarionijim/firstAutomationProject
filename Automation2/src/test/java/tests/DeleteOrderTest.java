package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.CartPage;
import pageobject.HomePage;
import pageobject.ProductPage;

public class DeleteOrderTest extends BaseTest {
	
	
	@Test(description = "order an item and then delete the product from the cart page")
	@Description("choose any product you want from the homepage and add to cart and after that go to your cart and delete the item from it")
	public void tc01_DeleteOrder() {
		//order item first
		HomePage hp = new HomePage(driver);
		hp.laptopButton("Laptops");
		hp.chooseProductsFromCategories("Sony vaio i5");
		//add item to cart
		ProductPage pp = new ProductPage(driver);
		pp.addToCart();
		//click on cart button menu
		hp = new HomePage(driver);
		hp.clickOnCart();
		//remove\delete item from cart
		CartPage cp = new CartPage(driver);
		cp.deleteItemFromCart();
	}
}
