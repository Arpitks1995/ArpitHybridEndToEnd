package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@name=\"search\"]"));
		searchbox.sendKeys("imac");
		Thread.sleep(2000);
		WebElement searchbutton=driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"]"));
		searchbutton.click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
