package AnasModule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement helloField=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		WebElement searchField=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		Actions action=new Actions(driver);
		//action.moveToElement(helloField).build().perform();
		
		//To enter the Words
		
		action.moveToElement(searchField).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		

	}

}
