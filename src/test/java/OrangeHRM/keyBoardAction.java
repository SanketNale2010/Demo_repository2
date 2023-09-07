package OrangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class keyBoardAction {
public static void DeleteText() throws AWTException, InterruptedException {
		
		Robot robot = new Robot();	
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);

        // Release the keys
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);	
        Thread.sleep(1000);
       robot.keyPress(KeyEvent.VK_DELETE);
       robot.keyRelease(KeyEvent.VK_DELETE);	
		
	}
public static void CountryValue() throws AWTException, InterruptedException {
	    Robot robot = new Robot();	
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
	
}

}
