package homework09;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class task01 extends TestBase {
    @Test
    public void test (){
            // Task 1: Go to URL: https://facebook.com
            driver.get("https://facebook.com");


            // Task 2: Get all cookies
            System.out.println("All Cookies:");
            driver.manage().getCookies().forEach(System.out::println);

            // Task 3: Add a new cookie
            Cookie newCookie = new Cookie("exampleCookie", "exampleValue");
            driver.manage().addCookie(newCookie);

            // Verify that the cookie is added
            Cookie addedCookie = driver.manage().getCookieNamed("exampleCookie");
            Assert.assertNotNull(addedCookie);
            Assert.assertEquals(addedCookie.getValue(), "exampleValue");

            // Task 4: Delete a cookie by name
            driver.manage().deleteCookieNamed("exampleCookie");

            // Verify that the cookie is deleted
            Cookie deletedCookie = driver.manage().getCookieNamed("exampleCookie");
            Assert.assertNull(deletedCookie);

            // Task 5: Delete all cookies
            driver.manage().deleteAllCookies();

            // Verify that all cookies are deleted
            Assert.assertTrue(driver.manage().getCookies().isEmpty());


    }
}
