package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM 
{
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement txt_Username;
	
	@FindBy(name="pwd")
	WebElement txt_Password;
	
	@FindBy(xpath="//a[@id='loginButton']")
	WebElement btn_Login;
	
	@FindBy(xpath="//*[@id=\"logoutLink\"]")
	WebElement logout_Btn;
	
	public LoginPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername(String username)
	{
		txt_Username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_Password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_Login.click();
	}
	
	public void isLogoutPresent()
	{
		logout_Btn.isDisplayed();
	}
	
	
	public void loginValidUser(String username,String password)
	 {
		txt_Username.sendKeys(username);
		txt_Password.sendKeys(password);
		btn_Login.click();
		logout_Btn.isDisplayed();
		 
	 }
}
