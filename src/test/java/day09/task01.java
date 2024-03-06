package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class task01 extends TestBase {

    @Test
    public void testDragAndDrop() {
        // Go to the URL
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Find the source elements (capitals) and target elements (countries)
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));

        WebElement norway = driver.findElement(By.id("box101"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement unitedstates = driver.findElement(By.id("box103"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform drag and drop actions to fill in the capitals by country
        actions.dragAndDrop(oslo, norway).perform();
        actions.dragAndDrop(stockholm, sweden).perform();
        actions.dragAndDrop(washington, unitedstates).perform();
        actions.dragAndDrop(copenhagen, denmark).perform();
        actions.dragAndDrop(seoul, southKorea).perform();
        actions.dragAndDrop(rome, italy).perform();
        actions.dragAndDrop(madrid, spain).perform();


    }

}