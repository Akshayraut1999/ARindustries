package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.loginpage;

public class logintest {
	
	 public WebDriver driver;
	 public loginpage lp;
	 public void LOGIN() {
		lp=new loginpage(driver);
		}
	
	@BeforeClass
	public void preconditions() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	LOGIN();
      } 
	
	@Test
	public void login() throws InterruptedException {
		lp.enterlogincredentials("Admin", "admin123");
		Thread.sleep(2000);
		lp.clickonsubmit();
		
	}
	
	@AfterClass
	public void Teardown() {
		driver.close();
	}

}
