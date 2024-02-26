package homework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Home_Work2 {

    public static void main(String[] args) {
        // Invoke Chrome Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to Facebook homepage URL: https://www.facebook.com/
        driver.navigate().to("https://www.facebook.com/");

        // Verify expected URL equals the actual URL.
        driver.get("https://www.facebook.com/");
        String expected_Url = "https://www.facebook.com/";
        String actual_Url = driver.getCurrentUrl();
        if (expected_Url.equals(actual_Url)) {
            System.out.println("Compatible URL");
        } else {
            System.out.println("Different URL");
        }

        // Verify pagesource of Facebook contains "Facebook".
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Facebook")) {
            System.out.println("Page source contains 'Facebook'");
        } else {
            System.out.println("Page source does not contain 'Facebook'");
        }

        // Close the browser
        driver.quit();
    }
}