package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
//declaration
	// address of + icon
	@FindBy(id = "add")
	private WebElement plusIcon;
	// address of add to cart
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addCartBtn;

	// initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public void addCartButton() {
		addCartBtn.click();
	}

}
