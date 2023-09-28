package Scripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLibrarary.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws Throwable {
		Thread.sleep(3000);
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.dropdowns(sd.getSelectCatageryDd(), pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
		Point coOrdinates = tp.getFacebookLink().getLocation();
		int x = coOrdinates.getX();
		int y = coOrdinates.getY();
		
		utilities.scrollbar(driver, x, y);
		//utilities.scrollbar(driver, tp.getFacebookLink());
		Thread.sleep(6000);
		tp.facebookWebElement();
		
		
		
		
		
		
	}

}
