package homework02;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_05 {

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open the URL
        driver.get("https://www.w3schools.com/");
        System.out.println("w3schools was opend succsesfully!");

        // Print the position and size of the page
        Point position = driver.manage().window().getPosition();
        Dimension size = driver.manage().window().getSize();
        System.out.println("Position: " + position);
        System.out.println("Size: " + size);

        // Minimize the page
        driver.manage().window().setPosition(new Point(-2000, 0));

        // Wait for 7 seconds in the icon state
        Thread.sleep(7000);
        System.out.println("wait for 7 seconds");

        // Maximize the page
        driver.manage().window().maximize();
        System.out.println("Maximize window");

        // Print the position and dimensions of the page in maximized state
        position = driver.manage().window().getPosition();
        size = driver.manage().window().getSize();
        System.out.println("Position (Maximized): " + position);
        System.out.println("Size (Maximized): " + size);

        // Make the page fullscreen
        driver.manage().window().fullscreen();
        System.out.println("Set FullScreen");


        // Close the browser
        driver.quit();
    }
}