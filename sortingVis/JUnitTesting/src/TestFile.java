import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import java.io.File;


public class TestFile {

    @Test
    public void test1a() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // try-catch block to handle exceptions
        try {

            // Create a file object
            File f = new File("src\\validation.html");

            // Get the absolute path of file f
            String absolute = f.getAbsolutePath();

            //Uncomment the following line to see the absolute path seen by the program
            //System.out.println(absolute);

            driver.get("file:///" + absolute);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //Find the relevant elements on the web page
        WebElement firstName = driver.findElement(By.id("txtFirstName"));
        WebElement lastName = driver.findElement(By.id("txtLastName"));
        Select drpGender = new Select(driver.findElement(By.name("selectGender")));
        Select drpState = new Select(driver.findElement(By.name("selectState")));
        WebElement email = driver.findElement(By.id("txtEmail"));
        WebElement phone = driver.findElement(By.id("txtPhone"));
        WebElement address = driver.findElement(By.id("txtAddress"));

        //Fill website fields with information for the test
        firstName.sendKeys("Jason");
        lastName.sendKeys("Momoa");
        drpGender.selectByVisibleText("Male");
        drpState.selectByVisibleText("Iowa");
        email.sendKeys("jason@gmail.com");
        phone.sendKeys("5157043322");
        address.sendKeys("Ames,IA");

        //Find submit button and click it
        WebElement submitButton = driver.findElement(By.id("btnValidate"));
        submitButton.click();

        //Get final result string
        WebElement finalResult = driver.findElement(By.id("labelNotifytxtFinalResult"));
        //String finalResultString = finalResult.getAttribute("value");
        String finalResultString = finalResult.getText();

        //Assert that the first test completes successfully
        Assert.assertEquals(finalResultString, "OK");

        driver.quit();
    }

    @Test
    public void test1b() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // try-catch block to handle exceptions
        try {

            // Create a file object
            File f = new File("src\\validation.html");

            // Get the absolute path of file f
            String absolute = f.getAbsolutePath();

            //Uncomment the following line to see the absolute path seen by the program
            //System.out.println(absolute);

            driver.get("file:///" + absolute);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //Find the relevant elements on the web page
        //Phone not needed for this test
        WebElement firstName = driver.findElement(By.id("txtFirstName"));
        WebElement lastName = driver.findElement(By.id("txtLastName"));
        Select drpGender = new Select(driver.findElement(By.name("selectGender")));
        Select drpState = new Select(driver.findElement(By.name("selectState")));
        WebElement email = driver.findElement(By.id("txtEmail"));
        //WebElement phone = driver.findElement(By.id("txtPhone"));
        WebElement address = driver.findElement(By.id("txtAddress"));

        //Fill website fields with information for the test
        //Phone number purposely blank for this test
        firstName.sendKeys("Jason");
        lastName.sendKeys("Momoa");
        drpGender.selectByVisibleText("Male");
        drpState.selectByVisibleText("Iowa");
        email.sendKeys("jason@gmail.com");
        //phone.sendKeys("5157043322");
        address.sendKeys("Ames,IA");

        //Find submit button and click it
        WebElement submitButton = driver.findElement(By.id("btnValidate"));
        submitButton.click();

        //Get final result string
        WebElement finalResult = driver.findElement(By.id("labelNotifytxtFinalResult"));
        //String finalResultString = finalResult.getAttribute("value");
        String finalResultString = finalResult.getText();

        //Assert that the second test results in an error
        Assert.assertEquals(finalResultString, "Error");

        driver.quit();
    }

    @Test
    public void test2a() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("src\\viewCars.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            //Find submit button and click it
            WebElement submitButton = driver.findElement(By.id("lblYearColumn"));
            submitButton.click();

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void test2b() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("src\\viewCars.html");

                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();

                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                driver.get("file:///" + absolute);
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

            //Find submit button and click it
            Select drpManufacturer = new Select(driver.findElement(By.name("selectManufacturer")));
            drpManufacturer.selectByVisibleText("Toyota");

            driver.quit();
        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }
}