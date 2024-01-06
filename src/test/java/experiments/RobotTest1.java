package experiments;

import java.awt.AWTException;
import java.awt.Robot;

public class RobotTest1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot=new Robot();
		Thread.sleep(3000);
		robot.mouseMove(300, 400);
		
		

	}

}
