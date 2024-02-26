package homework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Home_Work1 {

        //Create main method
    public static void main(String[] args) {
        //Create chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Open google home page: https://www.google.com/
        driver.get("https://www.google.com/");
        //Print Title on page
        String title = driver.getTitle();
        System.out.println("title = " + title);
        //Print Current URL on page
        String url = driver.getCurrentUrl();
        System.out.println("URL = " + url);
        //Close/Quit the browser
        driver.quit();
    }


}
