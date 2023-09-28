package genericLibrarary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	// 1. Handling drop downs
	public void dropdowns(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	// 2.Handling mouse hover
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	// 3.Handling right click
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	// 4.Handling double click
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	// 5.Handling drag and dropping
	public void dragdrop(WebDriver driver, WebElement src, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

	// 6.Handling frames
	public void switchFrame(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}

	// 7.Handling default content
	public void switchbackToFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	//8.Handling child browser pop up
	public void switchingTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
	}
	}
	
	//9.Handling parent Window
	public void parentWindow(WebDriver driver,String parent) {
		parent=driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
//10.handing scroll bars
	public void scrollbar(WebDriver driver,int x, int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void scrollbar(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollIntoview();",ele);
	}
	//11.Explicit wait
	public void explicit(WebDriver driver,WebElement ele,int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	//12.Handling alter pop up
	public void popup(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	

}
