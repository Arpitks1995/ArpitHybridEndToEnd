package com.qatutorial.qa.testcase;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	// WAP To Open the multiple tabs in the windows
	@Test
	public void loginWithValidCredentials() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	   driver.navigate().to("https://www.google.com/");
	   
	   ((JavascriptExecutor)driver).executeScript("window.open()");
	   
	   ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
	   Thread.sleep(2000);
	   driver.switchTo().window(tabs.get(1));
	   driver.get("https://www.youtube.com/");
	   Thread.sleep(2000);
	   driver.switchTo().window(tabs.get(0));
	   driver.get("https://rahulshettyacademy.com/");
	   Thread.sleep(2000);
	   driver.quit();
	   
	    
	   
	    
		
		
	}
	

}
