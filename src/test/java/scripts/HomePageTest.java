package scripts;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pageObjects.HomePage;
import util.TestBase;

public class HomePageTest extends TestBase {

	@Test
	public void testHomePage() throws Exception {
		homePage = PageFactory.initElements(driver, HomePage.class);
		
		driver.get(baseUrl);
		
		homePage.inputName("Lucas Santana Melo");
		homePage.buttonOkClick();
		
	}
}
