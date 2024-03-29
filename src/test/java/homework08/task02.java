package homework08;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import java.time.Duration;

public class task02 extends TestBase {

//    Go to URL: https://rangeslider.js.org/
//    Shift 100 units to the right and 100 units to the left on the horizontal axis.

    @Test
    public void sliderTest(){
        By slider = By.xpath("//div[@id='js-rangeslider-0']//div[@class='rangeslider__handle']");

        driver.get("https://rangeslider.js.org/");
        WebElement sliderButton = driver.findElement(slider);
        actions
                .dragAndDropBy(sliderButton,100,-0)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(sliderButton,-100,0)
                .build()
                .perform();
    }

}
