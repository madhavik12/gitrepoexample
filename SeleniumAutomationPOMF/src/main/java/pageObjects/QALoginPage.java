package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QALoginPage {

	@FindBy(how=How.NAME,using="txtUserName")
	private WebElement username;
	
	@FindBy(how=How.NAME,using="txtPassword")
	private WebElement password;
	
	@FindBy(how=How.NAME,using="Submit")
	private WebElement loginbutton;
	
	// define method to enter username
	public void Enterusername(String uname)
	{
		username.sendKeys(uname);
	}
	
	// define method to enter password
	public void Enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	// define method to click login button
	public void ClickLogin()
	{
		loginbutton.click();
	}
}
