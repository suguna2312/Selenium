package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText ="Log in")
	private WebElement loginLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCart;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}
	
	
	

}
