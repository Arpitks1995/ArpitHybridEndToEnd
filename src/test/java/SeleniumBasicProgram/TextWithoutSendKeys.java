package SeleniumBasicProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextWithoutSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	   driver.navigate().to("https://www.google.com/");
	  driver.findElement(By.xpath("//textarea[@type=\"search\"]")).sendKeys("food");
	   driver.findElement(By.xpath("(//input[@value=\"Google Search\"])[2]")).click();
	   Thread.sleep(3000);
	   List<WebElement> links = driver.findElements(By.partialLinkText("food"));
	   
	   for(WebElement link: links) {
		   System.out.println(link.getAttribute("href"));
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	/*  WebElement searchbox= driver.findElement(By.xpath("//input[@name=\"search\"]"));
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].value='imac'", searchbox);
*/
	}

}
