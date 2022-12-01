package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(xpath="//input[@name='username']")
	 public WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	public loginpage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	 
	public void enterlogincredentials(String USERNAME, String PASSWORD) {
		
		username.sendKeys(USERNAME);
		
		password.sendKeys(PASSWORD);
		
	}
	
	public void clickonsubmit() {
		submit.click();
	}
	
	
	

}
