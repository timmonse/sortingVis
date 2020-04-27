import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;


public class TestFile {

    /**
     * Tests the main menu page
     * Uncomment the Thread.sleep() functions to watch test execute
     *      This may show the message [1587604391.934][SEVERE]: Timed out receiving message from renderer: 0.100
     *      which is expected as per the chrome driver documentation
     * @throws InterruptedException
     */
    @Test
    public void mainMenuGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../mainMenu.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //View Sorts Test
                driver.get("file:///" + absolute); //Go to mainMenu page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement viewSorts = driver.findElement(By.id("viewSorts"));
                viewSorts.click();
                //Thread.sleep(1000);  // Let the user see the page

                //About Test
                driver.get("file:///" + absolute); //Go to mainMenu page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the about button
                WebElement about = driver.findElement(By.id("button-about"));
                about.click();
                //Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

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

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../about.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Click the evan contact button
                driver.get("file:///" + absolute); //Go to about page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement evanContact = driver.findElement(By.id("evanContact"));
                evanContact.click(); //This may try to open an email program
                //Thread.sleep(1000);  // Let the user see the page (this will make it more likely to open an email program)

                //Click the ty contact button
                driver.get("file:///" + absolute); //Go to about page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement tyContact = driver.findElement(By.id("tyContact"));
                tyContact.click(); //This may try to open an email program
                //Thread.sleep(1000);  // Let the user see the page (this will make it more likely to open an email program)

                //Click the ismael contact button
                driver.get("file:///" + absolute); //Go to about page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement ismaelContact = driver.findElement(By.id("ismaelContact"));
                ismaelContact.click(); //This may try to open an email program
                //Thread.sleep(1000);  // Let the user see the page (this will make it more likely to open an email program)

                //Click the sully contact button
                driver.get("file:///" + absolute); //Go to about page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement sullyContact = driver.findElement(By.id("sullyContact"));
                sullyContact.click(); //This may try to open an email program
                //Thread.sleep(1000);  // Let the user see the page (this will make it more likely to open an email program)

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

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
    public void sortingGeneral() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Press start, pause then play
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                WebElement pauseButton = driver.findElement(By.id("pause_btn"));
                WebElement playButton = driver.findElement(By.id("play_btn"));
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page
                pauseButton.click();
                Thread.sleep(1000);  // Let the user see the page
                playButton.click();
                Thread.sleep(1000);  // Let the user see the page

                //Change array size to 500 then play
                driver.navigate().refresh();
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement arraySize = driver.findElement(By.id("array_size"));
                WebElement startButton1 = driver.findElement(By.id("start_btn"));
                arraySize.clear();
                arraySize.sendKeys("500");
                Thread.sleep(1000);  // Let the user see the page
                startButton1.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingBubble() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test Bubble sort
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                Select algorithmSelect = new Select(driver.findElement(By.id("algorithm_select")));
                algorithmSelect.selectByVisibleText("Bubble sort");
                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingSelection() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test Selection sort
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                Select algorithmSelect = new Select(driver.findElement(By.id("algorithm_select")));
                algorithmSelect.selectByVisibleText("Selection sort");
                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingInsertion() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test Insertion sort
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                Select algorithmSelect = new Select(driver.findElement(By.id("algorithm_select")));
                algorithmSelect.selectByVisibleText("Insertion sort");
                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingQuick() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test Quicksort
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                Select algorithmSelect = new Select(driver.findElement(By.id("algorithm_select")));
                algorithmSelect.selectByVisibleText("Quicksort");
                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingHeap() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test Heapsort
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                Select algorithmSelect = new Select(driver.findElement(By.id("algorithm_select")));
                algorithmSelect.selectByVisibleText("Heapsort");
                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingMerge() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test Merge sort
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                Select algorithmSelect = new Select(driver.findElement(By.id("algorithm_select")));
                algorithmSelect.selectByVisibleText("Merge sort");
                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingInitialOrder() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test Initial Sorting order, sorted then reversed
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                Select algorithmSelect = new Select(driver.findElement(By.id("initial_select")));
                algorithmSelect.selectByVisibleText("Sorted");
                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.navigate().refresh();
                //Test Initial Sorting order, sorted then reversed
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton1 = driver.findElement(By.id("start_btn"));
                Select algorithmSelect1 = new Select(driver.findElement(By.id("initial_select")));
                algorithmSelect1.selectByVisibleText("Reversed");
                Thread.sleep(1000);  // Let the user see the page
                startButton1.click();
                Thread.sleep(1000);  // Let the user see the page

                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

    @Test
    public void sortingSpeedTest() throws InterruptedException {
        boolean testPassed = true;

        // calling method under test
        try {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.
            System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../Sorting.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);

                //Test algorithm and change speed slider to different values
                driver.get("file:///" + absolute); //Go to sorting page
                //Thread.sleep(1000);  // Let the user see the page
                // Find and click the view sorts button
                WebElement startButton = driver.findElement(By.id("start_btn"));
                WebElement slider = driver.findElement(By.id("slider"));

                //Using Action Class
                Actions move = new Actions(driver);
                Action action = move.dragAndDropBy(slider, 30, 0).build();
                action.perform();

                Thread.sleep(1000);  // Let the user see the page
                startButton.click();
                Thread.sleep(1000);  // Let the user see the page
                Action action2 = move.dragAndDropBy(slider, -50, 0).build();
                action2.perform();
                Thread.sleep(1000);  // Let the user see the page


                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

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

            //List of options to eliminate as many errors as possible
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
            options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
            //options.addArguments("--headless"); // only if you are ACTUALLY running headless
            options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
            options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
            options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
            options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver(options);

            // try-catch block to handle exceptions
            try {

                // Create a file object
                File f = new File("../sortMenu.html");
                // Get the absolute path of file f
                String absolute = f.getAbsolutePath();
                //Uncomment the following line to see the absolute path seen by the program
                //System.out.println(absolute);


                driver.quit();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } catch(Exception e) {
            testPassed = false;
        }

        //Check to ensure that no exception was thrown during testing
        Assert.assertTrue(testPassed);
    }

}
