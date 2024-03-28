package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario1 {
	
	WebDriver driver;
	public Scenario1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a")
	WebElement sell;
	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[1]/a")
	WebElement dashboard;
	
	public void sell_dropdown() {
		sell.click();
	}
	
	public void my_dashboard() {
		dashboard.click();
	}

}
