package homework7;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortMenuTest {

    static WebDriver driver;

    //	Change your selenium driver path here
    static String pathLoginPage="file:///C:\\Users\\Ismael\\Documents\\Spring2020Classes\\ComS319\\Project\\g35\\sortingVis\\sortMenu.html";
//	static String pathChromeDriver = "";


    @BeforeClass
    public static void openBrowser()
    {
//		System.setProperty("webdriver.chrome.driver", pathChromeDriver);
        driver= new ChromeDriver() ;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();

    }

    @Test
    public void testBubbleSortOpen() throws InterruptedException {
        driver.get(pathLoginPage);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sorts-display\"]/div[1]")).click();
        Select algoSelect = new Select(driver.findElement(By.xpath("//*[@id=\"algorithm_select\"]")));

        System.out.println(algoSelect.getFirstSelectedOption().getText());
        String selection = algoSelect.getFirstSelectedOption().getText();
        assertEquals("Bubble sort is selected",selection, "Bubble sort");
        Thread.sleep(2000);
    }

    @Test
    public void testSelectionSortOpen() throws InterruptedException {
        driver.get(pathLoginPage);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sorts-display\"]/div[2]")).click();
        Select algoSelect = new Select(driver.findElement(By.xpath("//*[@id=\"algorithm_select\"]")));

        System.out.println(algoSelect.getFirstSelectedOption().getText());
        String selection = algoSelect.getFirstSelectedOption().getText();
        assertEquals("Selection Sort is selected",selection, "Selection sort");
        Thread.sleep(2000);
    }

    @Test
    public void testMergeSortOpen() throws InterruptedException {
        driver.get(pathLoginPage);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sorts-display\"]/div[3]")).click();
        Select algoSelect = new Select(driver.findElement(By.xpath("//*[@id=\"algorithm_select\"]")));

        System.out.println(algoSelect.getFirstSelectedOption().getText());
        String selection = algoSelect.getFirstSelectedOption().getText();
        assertEquals("Merge Sort is selected",selection, "Merge sort");

        Thread.sleep(2000);
    }

    @Test
    public void testInsertionSortOpen() throws InterruptedException {
        driver.get(pathLoginPage);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sorts-display\"]/div[4]")).click();
        Select algoSelect = new Select(driver.findElement(By.xpath("//*[@id=\"algorithm_select\"]")));

        System.out.println(algoSelect.getFirstSelectedOption().getText());
        String selection = algoSelect.getFirstSelectedOption().getText();
        assertEquals("Insertion Sort is selected",selection, "Insertion sort");

        Thread.sleep(2000);
    }

    @Test
    public void testQuickSortOpen() throws InterruptedException {
        driver.get(pathLoginPage);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sorts-display\"]/div[5]")).click();
        Select algoSelect = new Select(driver.findElement(By.xpath("//*[@id=\"algorithm_select\"]")));

        System.out.println(algoSelect.getFirstSelectedOption().getText());
        String selection = algoSelect.getFirstSelectedOption().getText();
        assertEquals("Quick Sort is selected",selection, "Quicksort");
        Thread.sleep(2000);
    }

    @Test
    public void testHeapSortOpen() throws InterruptedException {
        driver.get(pathLoginPage);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sorts-display\"]/div[6]")).click();
        Select algoSelect = new Select(driver.findElement(By.xpath("//*[@id=\"algorithm_select\"]")));

        System.out.println(algoSelect.getFirstSelectedOption().getText());
        String selection = algoSelect.getFirstSelectedOption().getText();
        assertEquals("Heap Sort is selected",selection, "Heapsort");
        Thread.sleep(2000);
    }

}