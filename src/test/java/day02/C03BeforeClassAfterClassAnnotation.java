package day02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class C03BeforeClassAfterClassAnnotation {
    static WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        System.out.println("Before class method is executed...");
    }

    @AfterClass
    public  void afterClass(){
        driver.quit();
        System.out.println("After Classs method is executed...");
    }

}
