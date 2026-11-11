package page_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeralaProperty_login {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]") WebElement login_button;
	
	public KeralaProperty_login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	public String title_method()
	{
		String title=driver.getTitle();
		return title;
	}
	
	
	public void login_method(String user, String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		login_button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}

}

