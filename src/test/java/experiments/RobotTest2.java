package experiments;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotTest2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	Robot robot=new Robot();
	Thread.sleep(3000);
	robot.mouseWheel(30);
	Thread.sleep(3000);
	robot.mouseWheel(-20);
	
	

	}

}
