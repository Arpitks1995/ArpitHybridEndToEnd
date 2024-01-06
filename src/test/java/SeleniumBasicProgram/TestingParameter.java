package SeleniumBasicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestingParameter {
@Test
@Parameters("url")
public void amanTest(String URL) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
   driver.navigate().to(URL);
  WebElement searchbox= driver.findElement(By.xpath("//input[@name=\"search\"]"));
  
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("arguments[0].value='imac'", searchbox);
	
}
}
