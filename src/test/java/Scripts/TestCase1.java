package Scripts;

import org.testng.annotations.Test;

import PomPages.AddToCartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLibrarary.BaseClass;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable {
		Thread.sleep(3000);
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursebtn());
		sd.javalinkWebElement();
		Thread.sleep(3000);
		AddToCartPage ac = new AddToCartPage(driver);
		utilities.doubleClick(driver, ac.getPlusIcon());
		ac.addCartButton();
		Thread.sleep(3000);
		utilities.popup(driver);

	}

}
