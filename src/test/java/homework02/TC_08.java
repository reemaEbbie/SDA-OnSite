package homework02;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_08 {
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
        System.out.println("Broswer closed");
    }

    @Test
    public void test01() {
        System.out.println("Tests are starting to run...");
        // Open the Google homepage
        driver.get("https://www.google.com/");

        // Get the page title when the window is maximized
        String titleMaximized = driver.getTitle();

        // Minimize the window
        driver.manage().window().minimize();

        // Get the page title when the window is minimized
        String titleMinimized = driver.getTitle();

        // Test if the titles are the same
        if (titleMaximized.equals(titleMinimized)) {
            System.out.println("Test passed: Title is the same when the window is maximized and minimized");
        } else {
            System.out.println("Test failed: Title is not the same when the window is maximized and minimized");
        }
        System.out.println("Tests have finished running");
    }

    @Test
    public void test02() {
        System.out.println("Tests are starting to run...");
        // Open the Google homepage
        driver.get("https://www.google.com/");

        // Make the page fullscreen
        driver.manage().window().fullscreen();

        // Get the page title
        String pageTitle = driver.getTitle();

        // Test if the title does not contain "Video"
        if (!pageTitle.contains("Video")) {
            System.out.println("Test passed: Title does not contain 'Video' when the page is fullscreen");
        } else {
            System.out.println("Test failed: Title contains 'Video' when the page is fullscreen");
        }
        System.out.println("Tests have finished running");
    }

    @Test
    public void test03() {
        System.out.println("Tests are starting to run...");
        // Open the Google homepage
        driver.get("https://www.google.com/");

        // Get the current URL
        String currentURL = driver.getCurrentUrl();

        // Test if the URL contains "google"
        if (currentURL.contains("google")) {
            System.out.println("Test passed: URL contains 'google'");
        } else {
            System.out.println("Test failed: URL does not contain 'google'");
        }
        System.out.println("Tests have finished running");
    }
}