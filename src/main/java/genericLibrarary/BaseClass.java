package genericLibrarary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Propertyfile pdata = new Propertyfile();
	public WebDriverUtilities utilities= new WebDriverUtilities();

	@BeforeMethod
	public void openApp() throws Throwable {
		WebDriverManager.edgedriver().setup();

		// upcating statement
		driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// use of get method
		driver.get(pdata.getPropertydata("url"));
		Thread.sleep(3000);
	}

	@AfterMethod
	public void closeApp(ITestResult res) throws Throwable {
		int status = res.getStatus();
		String name = res.getName();
		if (status == 2) {
			Photo p = new Photo();
			p.getPhoto(driver, name);
		}
		driver.quit();

	}
}
