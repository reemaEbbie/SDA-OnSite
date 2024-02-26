package homework02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.awt.*;

public class TC_04 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the W3Schools URL
        driver.get("https://www.w3schools.com/");
        System.out.println("w3schools was opend succsesfully!");

        // Get and print the position and size of the page
        Point position = driver.manage().window().getPosition();
        Dimension size = driver.manage().window().getSize();
        System.out.println("Position: " + position);
        System.out.println("Size: " + size);

        // Adjust the position and size of the page as desired
        int newX = 100; // Desired X position
        int newY = 100; // Desired Y position
        int newWidth = 800; // Desired width
        int newHeight = 600; // Desired height
        driver.manage().window().setPosition(new Point(newX, newY));
        driver.manage().window().setSize(new Dimension(newWidth, newHeight));

        // Test that the page is in the desired position and size
        position = driver.manage().window().getPosition();
        size = driver.manage().window().getSize();
        System.out.println("New Position: " + position);
        System.out.println("New Size: " + size);

        // Close the page
        driver.quit();
    }
    }

