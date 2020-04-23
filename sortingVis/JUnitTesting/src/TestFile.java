import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;


public class TestFile {

    @Test
    public void mainMenuGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../mainMenu.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);

                Thread.sleep(1000);  // Let the user see the page

                WebElement viewSorts = driver.findElement(By.id("viewSorts"));
                viewSorts.click();

                Thread.sleep(1000);  // Let the user see the page

                driver.get("file:///" + absolute);

                Thread.sleep(1000);  // Let the user see the page

                WebElement about = driver.findElement(By.id("about-button"));
                about.click();

                Thread.sleep(1000);  // Let the user see the page


            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void aboutGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../about.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);

                Thread.sleep(1000);  // Let the user see the page
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void instructionsGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../instructions.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);

                Thread.sleep(1000);  // Let the user see the page
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void settingsGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../settings.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);

                Thread.sleep(1000);  // Let the user see the page
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);

                Thread.sleep(1000);  // Let the user see the page
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortMenuGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../sortMenu.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);

                Thread.sleep(1000);  // Let the user see the page
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

}
