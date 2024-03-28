package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario2 {
	
	WebDriver driver;
	public Scenario2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//a[@class='mb-header__sub__tabs__link js-menu-link' and contains(text(),'Sell')]")
//	WebElement sell;
//	@FindBy(xpath="//div[@class='mb-header__sub__tabs__dropdown js-menu-drop swiper-created']/div/div[2]/ul/li[1]/a[contains(text(),'My Dashboard')]")
//	WebElement dashboard;
	
	
	@FindBy(xpath="//div[@class='mb-search__wrap']/div[4]/span")
	WebElement search;
	
	
//	
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
	

}
