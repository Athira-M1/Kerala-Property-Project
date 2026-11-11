package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_package.KeralaProperty_HomePage;
import page_package.KeralaProperty_login;

public class KeralaProperty_BaseClass {
	
	public static WebDriver driver;
	public KeralaProperty_login obj;
	public KeralaProperty_HomePage home_obj;
	
	@BeforeTest
	public void browser_setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void object_method()
	{
		obj = new KeralaProperty_login(driver);
		home_obj = new KeralaProperty_HomePage(driver);
	}

}

