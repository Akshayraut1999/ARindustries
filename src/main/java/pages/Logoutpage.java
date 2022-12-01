package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
     @FindBy(xpath="//p[@class='oxd-userdropdown-name']")
     public WebElement profile;
     
     @FindBy(xpath="//a[text()='Logout']")
     public WebElement logout;
     
     public Logoutpage(WebDriver driver) {
    	 
    	 PageFactory.initElements(driver,this);
     }
     
     public void Profile() throws InterruptedException {
    	 profile.click();
    	 Thread.sleep(2000);
     }
     
     public void Logout() {
    	 logout.click();
     }
}
