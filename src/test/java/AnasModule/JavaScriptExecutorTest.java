package AnasModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchFiled=driver.findElement(By.xpath("//input[@name=\"search\"]"));
		WebElement openCart=driver.findElement(By.xpath("//*[text()=\"OpenCart\"]"));
		WebElement searchButton=driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Normal ScrollDown
		/*Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		driver.close(); */
		
		//Scrolldown upto Particular webElement
		//js.executeScript("arguments[0].scrollIntoView()", openCart);
		
		
		// By entering any values
		js.executeScript("arguments[0].value='iphone';", searchFiled);
		
		// By Click any WebElement
		js.executeScript("arguments[0].click();", searchButton);
		
		
		
		

	}

}
