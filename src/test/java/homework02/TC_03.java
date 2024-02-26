package homework02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03 {
    
        public static void main(String[] args) throws InterruptedException {
            // Expected Title
            String expectedTitle = "Facebook – log in or sign up";


            // Launch Chrome browser
            WebDriver driver = new ChromeDriver();

            // Open URL of Website
            driver.get("https://www.facebook.com/");

            // Maximize Window
            driver.manage().window().maximize();

            // Get Title of current Page
            String actualTitle = driver.getTitle();
            System.out.println("actualTitle = " + actualTitle);

            // Validate/Compare Page Title
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Page title is as expected.");
            } else {
                System.out.println("Page title is not as expected.");
            }

            // Close Browser
            driver.quit();
        }
    }