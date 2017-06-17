package util;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.HomePage;

public class TestBase {
	protected WebDriver driver;
	protected String baseUrl;
	protected HomePage homePage;
	
	@Before
	public void setUp(){
		baseUrl = "http://desafio.geofusion.tech/";
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
}
