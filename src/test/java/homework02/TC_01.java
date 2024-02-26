package homework02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/");
        System.out.println("w3schools was opend succsesfully!");
        driver.navigate().to("https://stackoverflow.com/");
        System.out.println("stackoverflow was opend succsesfully!");
        driver.navigate().back();
        System.out.println("Navigate back");
        driver.navigate().forward();
        System.out.println("Navigate forward");
        driver.navigate().refresh();
        System.out.println("Refresh");
        driver.quit();
    }
}