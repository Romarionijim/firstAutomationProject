package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;
import pageobject.ProductPage;

public class ChooseTwoProducts extends BaseTest {
	
	@Test(description = "choose two products and add them to cart")
	@Description("choose the first product from the phones category and add the item to your cart and then choose another product from the laptop category and add it to your cart")
	public void tc01_choose2ProductsFrom2Categories() {
		HomePage hp = new HomePage(driver);
		//choose first products from phones category
		hp.phoneButton("Phones");
		hp.chooseProductsFromCategories("Nexus 6");
		//add to cart
		ProductPage pp = new ProductPage(driver);
		pp.addToCart();
		//click on home button
		hp = new HomePage(driver);
		hp.homeButton();
		//choose second product from laptops category
		hp.laptopButton("Laptops");
		hp.chooseSecondProduct("MacBook Pro");
		//add second product to cart
		pp = new ProductPage(driver);
		String Actual = pp.addToCart();
		String Expected = "Product added";
		Assert.assertEquals(Actual, Expected);
		
	}
}
