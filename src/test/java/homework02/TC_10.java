package homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_10 {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to chromedriver.exe based on your system configuration
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the Automation Exercise homepage
        driver.get("https://automationexercise.com/");

        // Task 01 - Click on "Home"
        driver.findElement(By.linkText("Home")).click();

        // Task 02 - Click on "Products"
        driver.findElement(By.linkText("Products")).click();

        // Task 03 - Click on "Cart"
        driver.findElement(By.linkText("Cart")).click();

        // Task 04 - Click on "Signup / Login"
        driver.findElement(By.linkText("Signup / Login")).click();

        // Task 05 - Click on "Test Cases"
        driver.findElement(By.linkText("Test Cases")).click();

        // Task 06 - Click on "API Testing"
        driver.findElement(By.linkText("API Testing")).click();

        // Task 07 - Click on "Video Tutorials"
        driver.findElement(By.linkText("Video Tutorials")).click();

        // Task 08 - Click on "Contact us"
        driver.findElement(By.linkText("Contact us")).click();

        // Close the browser
        driver.quit();
    }
}