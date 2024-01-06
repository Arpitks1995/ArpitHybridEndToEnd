package SeleniumBasicProgram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	   driver.get("https://tutorialsninja.com/demo/");
	   
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   
	   for(WebElement link : links) {
		   String url=link.getAttribute("href");
		   
		   if(url==null||url.isEmpty()) {
			   System.out.println("URL is empty");
			   continue;
		   }
		   HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
		   huc.connect();
		   if(huc.getResponseCode()>=400) {
			   System.out.println(url+" is broken");
		   }else {
			   System.out.println(url+" is valid");
		   }
	   }
	   
	  

	}

}
