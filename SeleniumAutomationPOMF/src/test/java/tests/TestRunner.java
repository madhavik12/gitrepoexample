package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import pageObjects.QAHomePage;
import pageObjects.QALoginPage;

public class TestRunner {
	private WebDriver driver;
  @Test
  public void verifyLoginQA() {
	QALoginPage lp=PageFactory.initElements(driver, QALoginPage.class); 
	lp.Enterusername("qaplanet1"); 
	lp.Enterpassword("user1");
	lp.ClickLogin();
  }
  @Test
  public void doLogout()
  {
	QAHomePage hp=PageFactory.initElements(driver, QAHomePage.class); 
	hp.ClickLogout();
  }
  @BeforeClass
  public void beforeClass() {
      System.setProperty("webdriver.chrome.driver","C:\\seleniumPractice\\chromedriver.exe");		
driver=new ChromeDriver();
driver.get("http://apps.qaplanet.in/qahrm/login.php");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
