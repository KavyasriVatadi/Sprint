package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario3 {
	
	WebDriver driver;
	public Scenario3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a")
//	WebElement sell;
//	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[1]/a")
//	WebElement dashboard;
	@FindBy(xpath="//div[@class='mb-search__wrap']/div[4]/span")
	WebElement search;
	
	
	@FindBy(xpath="//div[@class='title-ellipsis' and contains(text(),'BHK')]")
	WebElement bhk_dropdown;
	@FindBy(xpath="//label[@class=\"filter__common__component__item__label\" and @for='bhk_11701']")
	WebElement bhk_size;
	@FindBy(xpath="//div[@class='filter__component topBhk activeFilter']/div[2]/div[2]")
	WebElement bhk_done;
	
//	public void sell_dropdown() {
//		sell.click();
//	}
//	
//	public void my_dashboard() {
//		dashboard.click();
//	}
//	
	public void search_button() {
		search.click();
	}
	
	
	public void bhk() {
		bhk_dropdown.click();
	}
	
	public void bhk_select() {
		bhk_size.click();
	}
	
	public void bhk_() {
		bhk_done.click();
	}

}
