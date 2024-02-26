package homework02;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TC_06 {
    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Maximize the window
        driver.manage().window().maximize();
        System.out.println("Window Maximized!");

        // Open the URL
        driver.get("https://www.youtube.com/");
        System.out.println("Youtube was opened");


        // Verify the page title contains the word "video" (case-insensitive)
        String pageTitle = driver.getTitle();
        if (pageTitle.toLowerCase().contains("video")) {
            System.out.println("Page title contains the word 'video'");
        } else {
            System.out.println("Page title does not contain the word 'video'");
        }

        // Minimize the window
        driver.manage().window().setPosition(new Point(-2000, 0));
        System.out.println("Window minimized!");


        // Verify the page title contains the word "video" (case-insensitive)
        pageTitle = driver.getTitle();
        if (pageTitle.toLowerCase().contains("video")) {
            System.out.println("Page title contains the word 'video'");
        } else {
            System.out.println("Page title does not contain the word 'video'");
        }

        // Make the page fullscreen
        driver.manage().window().fullscreen();

        // Close the driver
        driver.quit();
    }
}