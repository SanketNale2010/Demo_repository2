package ddd;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

 

public class KeyboardActions {

public static void DeleteData() throws AWTException, InterruptedException {

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

    public static void KeyPressI() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);

    }

    public static void KeyPressM() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
    }
}