package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
     static WebDriver driver;
	public static void screenshot(WebDriver driver ,String name) throws IOException {
		String path="C:\\Users\\HP\\eclipse-workspace1\\ARindustries\\testreport\\"+name+"\\.png";
		System.out.println(path);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	
	File destinationfile=new File(path);
		
		FileHandler.copy(sourcefile,destinationfile);
	}
	
	

}
