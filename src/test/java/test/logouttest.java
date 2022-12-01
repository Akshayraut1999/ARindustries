package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import pages.Logoutpage;
import pages.Screenshot;
import pages.loginpage;

public class logouttest {
	
	 public WebDriver driver;
	 loginpage lp;
	 Logoutpage hp;
	 
	public void initobject() {
		lp=new loginpage(driver);
		hp=new Logoutpage(driver);
	}
	  
	@BeforeClass
	public void launching() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initobject();
	}
	
	
	@BeforeMethod
	public void preconditions() {
		lp.enterlogincredentials("Admin", "admin123");
		lp.clickonsubmit();
	} 
	
	@Test(priority=1)
	public void verifyurl() {
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl,"Akshay Haushiram Raut", "Verify url test case failed");
	}
	@Test
	public void logout() throws InterruptedException, IOException {
		
		hp.Profile();
		hp.Logout();
		System.out.println("Logout successfully");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}


}
