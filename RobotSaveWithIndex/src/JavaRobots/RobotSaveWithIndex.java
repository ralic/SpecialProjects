/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRobots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author raliclo :
 * @Application: This program simulate key-pressing for numbers.
 * @Usage :This robot helps me to do data mining of web pages for further
 * web-page mad-reduce study or parsing using MacBookPro.
 */
public class RobotSaveWithIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        // TODO code application logic here
        // Simulation of pressing 123

        NumberToClick("123");
    }

    public static void RobotSave(String xx) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        try {
            // Simulate a mouse click
//                        robot.mousePress(InputEvent.BUTTON1_MASK);
//                        robot.mouseRelease(InputEvent.BUTTON1_MASK);
            // Simulate a key press
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_S);
            Thread.sleep(100);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_S);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_LEFT);
            robot.keyRelease(KeyEvent.VK_LEFT);
            NumberToClick(xx); // Key in number before saving
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER); // Save file robot
            Thread.sleep(5000);
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_META);// Quit window robot

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void NumberToClick(String x) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        int i;
        int n = x.length();
        String[] splitnumber = new String[n];
        for (i = 0; i < n; i++) {
            System.out.println(x.charAt(i));
            SimuPress(x.charAt(i));
        }
    }

    public static void SimuPress(char c) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Thread.sleep(100);
        switch (c) {
            case '0':
                robot.keyPress(KeyEvent.VK_0);
                robot.keyRelease(KeyEvent.VK_0);
                break;
            case '1':
                robot.keyPress(KeyEvent.VK_1);
                robot.keyRelease(KeyEvent.VK_1);
                break;
            case '2':
                robot.keyPress(KeyEvent.VK_2);
                robot.keyRelease(KeyEvent.VK_2);
                break;
            case '3':
                robot.keyPress(KeyEvent.VK_3);
                robot.keyRelease(KeyEvent.VK_3);
                break;
            case '4':
                robot.keyPress(KeyEvent.VK_4);
                robot.keyRelease(KeyEvent.VK_4);
                break;
            case '5':
                robot.keyPress(KeyEvent.VK_5);
                robot.keyRelease(KeyEvent.VK_5);
                break;
            case '6':
                robot.keyPress(KeyEvent.VK_6);
                robot.keyRelease(KeyEvent.VK_6);
                break;
            case '7':
                robot.keyPress(KeyEvent.VK_7);
                robot.keyRelease(KeyEvent.VK_7);
                break;
            case '8':
                robot.keyPress(KeyEvent.VK_8);
                robot.keyRelease(KeyEvent.VK_8);
                break;
            case '9':
                robot.keyPress(KeyEvent.VK_9);
                robot.keyRelease(KeyEvent.VK_9);
                break;
            default:
        }
    }
}

//
/**
 * VK_0 thru VK_9 are the same as ASCII '0' thru '9' (0x30 - 0x39) //
 */
//Robot robot = new Robot();
//    public static final int VK_0              = 0x30;
//    public static final int VK_1              = 0x31;
//    public static final int VK_2              = 0x32;
//    public static final int VK_3              = 0x33;
//    public static final int VK_4              = 0x34;
//    public static final int VK_5              = 0x35;
//    public static final int VK_6              = 0x36;
//    public static final int VK_7              = 0x37;
//    public static final int VK_8              = 0x38;
//    public static final int VK_9              = 0x39;
