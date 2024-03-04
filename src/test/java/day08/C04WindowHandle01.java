package day08;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C04WindowHandle01 extends TestBase {

    @Test
    public void test(){

        driver.get("https://amazon.com");
        String windowHandle = driver.getWindowHandle();


        //create a new tap

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
    }

}
