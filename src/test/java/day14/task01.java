package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class task01 {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testGoToFacebook() {
        driver.get("https://www.facebook.com");

    }

    @Test(dependsOnMethods = "testGoToFacebook")
    public void testGoToGoogle() {
        driver.get("https://www.google.com");

    }

    @Test(dependsOnMethods = "testGoToGoogle")
    public void testGoToAmazon() {
        driver.get("https://www.amazon.com");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}