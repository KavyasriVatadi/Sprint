package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario4 {
	
	WebDriver driver;
	public Scenario4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a")
//	WebElement sell;
//	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[1]/a")
//	WebElement dashboard;
	@FindBy(xpath="//div[@class='mb-search__wrap']/div[4]/span")
	WebElement search;
	
	@FindBy(xpath="//div[@class='title-ellipsis' and contains(text(),'Top Localities')]")
	WebElement localities_dropdown;
	@FindBy(xpath="//label[@class='filter__common__component__item__label' and contains(text(),'Kukatpally')]")
	WebElement locality_select;
	@FindBy(xpath="//div[@id='body']/div[1]/div/div[2]/div[1]/div/div[2]/div[3]")
	WebElement locality_done;
	
//	public void sell_dropdown() {
//		sell.click();
//	}
//	
//	public void my_dashboard() {
//		dashboard.click();
//	}
	
	public void search_button() {
		search.click();
	}
	
	public void localities() {
		localities_dropdown.click();
	}
	
	public void select_locality() {
		locality_select.click();
	}
	
	public void locality() {
		locality_done.click();
	}

}
