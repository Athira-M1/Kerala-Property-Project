package page_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeralaProperty_HomePage {
	
	WebDriver driver;
	Select obj1;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a") WebElement property;
	@FindBy(xpath="//*[@id=\"proptype\"]") WebElement property_for;
	@FindBy(xpath="//*[@id=\"listtype\"]") WebElement listing_plan;
	@FindBy(xpath="//*[@id=\"proplabel\"]") WebElement property_label;
	@FindBy(xpath="//*[@id=\"propcategory\"]") WebElement category;
	@FindBy(xpath="//*[@id=\"propcost\"]") WebElement expected_price;
	@FindBy(xpath="//*[@id=\"propbeds\"]") WebElement no_of_beds;
	@FindBy(xpath="//*[@id=\"propbaths\"]") WebElement no_of_baths;
	@FindBy(xpath="//*[@id=\"district\"]") WebElement district;
	@FindBy(xpath="//*[@id=\"proplocation\"]") WebElement location;
	@FindBy(xpath="//*[@id=\"propaddress\"]") WebElement property_address;
	@FindBy(xpath="//*[@id=\"introlabel\"]") WebElement title;
	@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/iframe") WebElement frame_tag;
	@FindBy(xpath="/html/body") WebElement summary_box;
	@FindBy(xpath="//*[@id=\"userfile\"]") WebElement property_photo;
	// @FindBy(xpath="//*[@id="sub_frmproperty"]) WebElement submit_button;
	
	
	public KeralaProperty_HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void add_property_method() 
	{
		property.click();
		
		obj1= new Select(property_for);  // creating object for select class
		obj1.selectByValue("sale");
		
		obj1= new Select(listing_plan);
		obj1.selectByValue("regular");
		
		property_label.sendKeys("Property");
		
		obj1= new Select(category);
		obj1.selectByValue("7");
		
		expected_price.sendKeys("500000");
		
		no_of_beds.sendKeys("5");
		
		no_of_baths.sendKeys("4");
		
		
		obj1= new Select(district);
		obj1.selectByValue("8");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(location));
		
	    obj1= new Select(location);
		obj1.selectByValue("82");
		
		property_address.sendKeys("Ernakulam");
		
		title.sendKeys("Summary Title");
		
		driver.switchTo().frame(frame_tag);
		
		summary_box.click();
		summary_box.sendKeys("abcdef");
		
		driver.switchTo().defaultContent();
		
		property_photo.sendKeys("C:\\Users\\Athira M\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-08-07 130300.png");
		
		// submit_button.click();
	}	
	}



