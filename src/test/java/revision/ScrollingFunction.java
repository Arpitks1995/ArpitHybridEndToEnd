package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingFunction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement Mac=driver.findElement(By.linkText("MacBook"));
		System.out.println(Mac);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//General Scrolling
		//js.executeScript("window.scrollBy(0,800)");
		
		js.executeScript("arguments[0].scrollIntoView()", Mac);
		

	}

}
