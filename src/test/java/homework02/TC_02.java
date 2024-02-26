package homework02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.yahoo.com/");
        System.out.println("yahoo was opend succsesfully!");
        driver.manage().window().maximize();
        System.out.println("window was maximaized succsesfully!");
        driver.navigate().to("https://facebook.com/");//amazon needs capache so facebook used insted
        System.out.println("facebook was opend succsesfully!");
        driver.manage().window().maximize();
        System.out.println("window was maximaized succsesfully!");
        driver.navigate().back();
        System.out.println("Navigate back");
        driver.navigate().forward();
        System.out.println("Navigate forward");
        driver.navigate().refresh();
        System.out.println("Refresh");
        driver.quit();
    }
}
