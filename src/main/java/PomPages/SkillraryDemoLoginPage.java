package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	// Declaration
	// address of course
	@FindBy(xpath = "//a[text()='COURSE']")
	private WebElement coursebtn;
	// address of java
	@FindBy(xpath = "(//a[text()='Java'])[1]")
	private WebElement javalink;
	// address of droopdown
	@FindBy(name = "addresstype")
	private WebElement selectCatageryDd;
	// address of feedback
	@FindBy(xpath = "//a[text()='FEEDBACK']")
	private WebElement feedbackLink;

	// initialization
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public WebElement getSelectCatageryDd() {
		return selectCatageryDd;
	}

	public void javalinkWebElement() {
		javalink.click();
	}

	public void feedbackLinkWebElement() {
		feedbackLink.click();
	}

}
