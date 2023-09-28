package Scripts;

import org.testng.annotations.Test;

import PomPages.InvoicePage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLibrarary.BaseClass;

public class TestCase3 extends BaseClass{
	@Test
	public void tc3() throws Throwable {
		Thread.sleep(3000);
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		sd.feedbackLinkWebElement();
		InvoicePage iv=new InvoicePage(driver);
		iv.downloadInvoicebtn();
		Thread.sleep(6000);
		
		
	}

}
