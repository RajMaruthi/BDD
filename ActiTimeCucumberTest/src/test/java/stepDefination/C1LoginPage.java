package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPagePOM;

public class C1LoginPage 
{

	WebDriver driver=null;
	LoginPagePOM login;

	@Before
	public void browserOpen()
	{
		String strPath=System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strPath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
/*	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}*/

	@Given("User is on login page")
	public void user_is_on_login_page()
	{
		driver.navigate().to("https://online.actitime.com/mbn/login.do");
	}

	@When("^User enters the(.*)and(.*)$")
	public void user_enters_the_username_and_password(String Username,String Password) throws InterruptedException
	{
		login=new LoginPagePOM(driver);
		
		login.enterUsername(Username.trim());
		Thread.sleep(5000);
		login.enterPassword(Password.trim());	
		Thread.sleep(10000);
	}

	@And("Click on the Login button")
	public void click_on_the_login_button() throws InterruptedException
	{
		login.clickLogin();
		Thread.sleep(10000);
	}

	@Then("Navigated to homepage")
	public void navigated_to_homepage() 
	{
		login.isLogoutPresent();
	}


}//main class close
