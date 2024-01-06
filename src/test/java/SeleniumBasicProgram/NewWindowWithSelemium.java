package SeleniumBasicProgram;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowWithSelemium {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
   driver.navigate().to("https://www.google.com/");
   Thread.sleep(2000);
   driver.switchTo().newWindow(WindowType.WINDOW);
   driver.get("https://www.youtube.com/");
   Thread.sleep(2000);
   
   ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
   System.out.println(tabs.size());
   driver.switchTo().window(tabs.get(0)).get("https://rahulshettyacademy.com/");
   Thread.sleep(2000);
   driver.switchTo().window(tabs.get(1)).close();
   Thread.sleep(2000);
   driver.switchTo().window(tabs.get(0)).close();
   
}

}
