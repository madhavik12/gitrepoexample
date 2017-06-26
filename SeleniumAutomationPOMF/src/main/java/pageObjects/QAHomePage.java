package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QAHomePage {

	@FindBy(how=How.LINK_TEXT,using="Logout")
	private WebElement logoutlink;
	
	// define method to click logout
	public void ClickLogout()
	{
		logoutlink.click();
	}
	
}
