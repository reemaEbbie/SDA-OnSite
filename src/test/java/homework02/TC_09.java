package homework02;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_09 {
    private WebDriver driver;

    @Before
    public void before() {

        // Create a new instance of ChromeDriver
        driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();
        System.out.println("Window maximized");
    }

    @After
    public void after() {
        // Close the browser
        driver.quit();
    }

    @Test
    public void test01() {
        System.out.println("STARTED");
        System.out.println("Test has started");

        // Minimize the window
        driver.manage().window().minimize();
        System.out.println("test01 WhenMinimized running");

        // Open the W3School homepage
        driver.get("https://www.w3schools.com/");
        System.out.println("w3schools Opened");

        // Get the page title
        String pageTitle = driver.getTitle();

        // Test if the title contains "w3school"
        if (pageTitle.contains("w3school")) {
            System.out.println("Test passed: Title contains 'w3school' when the window is minimized");
        } else {
            System.out.println("Test failed: Title does not contain 'w3school' when the window is minimized");
        }
        System.out.println("FINISHED");
    }

    @Test
    public void test02() {
        System.out.println("STARTED");
        System.out.println("Test has started");

        // Make the page fullscreen
        driver.manage().window().fullscreen();
        System.out.println("test02WhenFullscreen running");

        // Open the W3School homepage
        driver.get("https://www.w3schools.com/");
        System.out.println("w3schools Opened");

        // Get the page title
        String pageTitle = driver.getTitle();

        // Test if the title does not contain "boss"
        if (!pageTitle.contains("boss")) {
            System.out.println("Test passed: Title does not contain 'boss' when the page is fullscreen");
        } else {
            System.out.println("Test failed: Title contains 'boss' when the page is fullscreen");
        }
        System.out.println("FINISHED");
    }
}