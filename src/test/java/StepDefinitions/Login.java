package StepDefinitions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import MBPageFactory.Scenario1;
import MBPageFactory.Scenario2;
import MBPageFactory.Scenario3;
import MBPageFactory.Scenario4;
import MBPageFactory.Scenario5;
import MBPageFactory.loginPF;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	@Before
	public void before()
	{

		    ChromeOptions opt = new ChromeOptions(); 
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
			driver.get("https://www.magicbricks.com/");
			driver.manage().window().maximize();
	}
	
	@Given("I am on Magic Bricks App Login page")
	public void i_am_on_magic_bricks_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		loginPF lp = new loginPF(driver);
		lp.login();
		lp.logging();
	}

	@When("I enter Email ID as {string}")
	public void i_enter_email_id_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		loginPF lp = new loginPF(driver);
		String child_handle="";
	    Set<String> tab_handles = driver.getWindowHandles();
	    for (String child:tab_handles){
	        child_handle= child;
	    }
	    driver.switchTo().window(child_handle);
		lp.mail(string);
	

	}

	@When("I click on Next")
	public void i_click_on_next() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		loginPF nex = new loginPF(driver);
		nex.nxt();
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		loginPF pw=new loginPF(driver);
		pw.password(string);
	}

	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		loginPF lo=new loginPF(driver);
		lo.log();

	}

	@When("I click on Continue")
	public void i_click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		loginPF co=new loginPF(driver);
		co.conti();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		loginPF cr=new loginPF(driver);

		cr.end();

	}

	@Given("I am on the magicbricks website")
	public void i_am_on_the_magicbricks_website() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    
	}

	@When("I click on sell dropdown")
	public void i_click_on_sell_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario1 sd = new Scenario1(driver);
		sd.sell_dropdown();

	}

	@When("I click on Agent & Builder")
	public void i_click_on_agent_builder() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I am able to click on My Dashboard")
	public void i_am_able_to_click_on_my_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario1 db = new Scenario1(driver);
		db.my_dashboard();

	}

	@Then("Dashboard page will be displayed.")
	public void dashboard_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I am on My Dashboard page")
	public void i_am_on_my_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on search")
	public void i_click_on_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario2 search=new Scenario2(driver);
		search.search_button();

	}

	@Then("the flats for sale for particular location will be displayed")
	public void the_flats_for_sale_for_particular_location_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@When("I am on the flats for sale page")
	public void i_am_on_the_flats_for_sale_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on BHK size")
	public void i_click_on_bhk_size() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario3 select=new Scenario3(driver);
		select.bhk();
		select.bhk_select();

	}

	@When("I click on Done")
	public void i_click_on_done() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario3 select=new Scenario3(driver);
		select.bhk_();

	}

	@Then("the flats for sale page will be displayed")
	public void the_flats_for_sale_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I am on the flats for sale for BHK page")
	public void i_am_on_the_flats_for_sale_for_bhk_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on localities")
	public void i_click_on_localities() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario4 locality_dropdown = new Scenario4(driver);
		locality_dropdown.localities();

	}

	@When("I click on particular locality")
	public void i_click_on_particular_locality() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario4 locality_dropdown = new Scenario4(driver);
		locality_dropdown.select_locality();

	}

	@When("click on Done")
	public void click_on_done() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario4 locality_dropdown = new Scenario4(driver);
		locality_dropdown.locality();

	}

	@Then("the flats for sale for particular locality page will be displayed")
	public void the_flats_for_sale_for_particular_locality_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I am on the flats for sales for locality page")
	public void i_am_on_the_flats_for_sales_for_locality_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click on budget")
	public void i_click_on_budget() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario5 budget_dp = new Scenario5(driver);
		budget_dp.budget();

	}

	@When("select the minimum budget and maximum budget")
	public void select_the_minimum_budget_and_maximum_budget() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scenario5 budget_dp = new Scenario5(driver);
		budget_dp.min_budget();
		budget_dp.min_dropdown();
		budget_dp.max_budget();
		budget_dp.max_dropdown();
		budget_dp.done();
	}

	@Then("the flats for sale for particular budget will be displayed")
	public void the_flats_for_sale_for_particular_budget_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	

}