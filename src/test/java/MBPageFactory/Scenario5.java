package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario5 {
	
	WebDriver driver;
	public Scenario5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/a")
//	WebElement sell;
//	@FindBy(xpath="//body[@id='commercialIndex']/header/section[2]/div/ul/li[3]/div/div/div[2]/ul/li[1]/a")
//	WebElement dashboard;
	@FindBy(xpath="//div[@class='mb-search__wrap']/div[4]/span")
	WebElement search;
	
	@FindBy(xpath="//div[@class='title-ellipsis' and contains(text(),'Budget')]")
	WebElement budget_dropdown;
	@FindBy(xpath="//div[@id='body']/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/select")
	WebElement min;
	@FindBy(xpath="//div[@id='body']/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/select/option[7]")
	WebElement min_dp;
	@FindBy(xpath="//div[@id='body']/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/select")
	WebElement max;
	@FindBy(xpath="//div[@class='filter-budget__fieldset__min-max max']/select/option[@value='7000000']")
	WebElement max_dp;
	@FindBy(xpath="//div[@id='body']/div[1]/div/div[2]/div[2]/div/div[2]/div[2]")
	WebElement budget_done;
	
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
	
	public void budget() {
		budget_dropdown.click();
	}
	
	public void min_budget() {
		min.click();
	}
	
	public void min_dropdown() {
		min_dp.click();
	}
	
	public void max_budget() {
		max.click();
	}
	
	public void max_dropdown() {
		max_dp.click();
	}
	
	public void done() {
		budget_done.click();
	}
	

}
