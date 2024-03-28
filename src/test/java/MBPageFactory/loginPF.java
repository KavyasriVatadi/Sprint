package MBPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPF {
	WebDriver driver;
	public loginPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/header/section[1]/div/div[2]/div[2]/a")
	WebElement login;

	@FindBy(xpath="//div[@class='mb-login__box signup-box']//a[contains(text(),'Login')]")
	WebElement log;
	@FindBy(xpath="//input[@id='emailOrMobile' and @name='emailOrMobile']")
	WebElement email;
	@FindBy(xpath="//button[@id='btnStep1']")
	WebElement next;
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd;
	@FindBy(xpath="//button[@id='btnLogin']")
	WebElement lgn;
	@FindBy(xpath="//ancestor::div[@id='emailIdVerificationLinkDiv']//button[contains(text(),'Continue')]")
	WebElement con;
	@FindBy(xpath="//div[@id=\"userOnboardingWidget\"]/div/div[1]")

	WebElement cross;
	
	
	
	public void login() {
		login.click();
	}
	public void logging() {
		log.click();
	}
	public void mail(String data)
	{
		email.sendKeys(data);
	}
	public void nxt()
	{
		next.click();
	}
	public void password(String data)
	{
		pwd.sendKeys(data);
	}
	public void log()
	{
		lgn.click();
	}
	public void conti()
	{
		con.click();
	}
	public void end()
	{
		cross.click();
	}

	
	
	
	
	
	
	
	
	

	
	
	


}
