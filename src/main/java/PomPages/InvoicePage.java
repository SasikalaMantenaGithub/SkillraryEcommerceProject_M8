package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	// declaration
	// address of download invoice
	@FindBy(xpath = "//input[@value='Download Invoice']")
	private WebElement downloadInvoicebtn;

	// initialization
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void downloadInvoicebtn() {
		downloadInvoicebtn.click();
	}

}
