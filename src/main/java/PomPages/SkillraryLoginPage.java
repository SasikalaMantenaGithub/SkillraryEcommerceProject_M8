package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	// Declaration
	// address of gears webelement
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	// addresss of skillrary demo app
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	// address of search button
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searcgbtn;
	// address of search icon
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchTf;
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookiesicon;

	// initialization
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void gearsButton() {
		gearsbtn.click();
	}

	public void skillrarydemoappWebElement() {
		skillrarydemoapp.click();
	}

	public void searchTextField(String name) {
		searchTf.sendKeys(name);
	}

	public void searcgButton() {
		searcgbtn.click();
	}
	public void cookiesiconWebElement() {
		cookiesicon.click();
	}

}
