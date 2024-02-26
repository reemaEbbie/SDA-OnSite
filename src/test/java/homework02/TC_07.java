package homework02;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_07 {
    private WebDriver driver;

    @Before
    public void setup() {
        // Create a new instance of ChromeDriver
        driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();
    }

    @After
    public void test01() {
        // Close the browser
        driver.quit();
    }

    @Test
    public void test02() {
        System.out.println("Test is running...");
        // Open the YouTube homepage
        driver.get("https://www.youtube.com/");

        // Test if the current URL contains "youtube"
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("youtube")) {
            System.out.println("Test passed: Current URL contains 'youtube'");
        } else {
            System.out.println("Test failed: Current URL does not contain 'youtube'");
        }
        System.out.println("Test finished");
    }

    @Test
    public void test03() {
        System.out.println("Test is running...");
        // Open the YouTube homepage
        driver.get("https://www.youtube.com/");

        // Test if the title does not contain "Video"
        String pageTitle = driver.getTitle();
        if (!pageTitle.contains("Video")) {
            System.out.println("Test passed: Title does not contain 'Video'");
        } else {
            System.out.println("Test failed: Title contains 'Video'");
        }
        System.out.println("Test finished");
    }

    @Test
    public void test04() {
        System.out.println("Test is running...");
        // Open the YouTube homepage
        driver.get("https://www.youtube.com/");

        // Test if the URL contains "youtube"
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("youtube")) {
            System.out.println("Test passed: URL contains 'youtube'");
        } else {
            System.out.println("Test failed: URL does not contain 'youtube'");
        }
        System.out.println("Test finished");
    }

    @Test
    public void test05() {
        System.out.println("Test is running...");
        // Open the YouTube homepage
        driver.get("https://www.youtube.com/");

        // Test if the source page contains "youtube"
        String sourcePage = driver.getPageSource();
        if (sourcePage.contains("youtube")) {
            System.out.println("Test passed: Source page contains 'youtube'");
        } else {
            System.out.println("Test failed: Source page does not contain 'youtube'");
        }
        System.out.println("Test finished");
    }
}
