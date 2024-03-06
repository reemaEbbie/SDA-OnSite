package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class challenge extends TestBase {
    @Test
    public void test() {
        driver.get("https://www.youtube.com/");

        WebElement inputFild =driver.findElement(By.xpath("//input[@id='search']"));
        inputFild.sendKeys("interstellar");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")).click();

        WebElement firstVideo = driver.findElement(By.cssSelector("a#video-title"));
        firstVideo.click();

        // Assert that the video has soundtrack
        WebElement videoUploader = driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-watch-metadata'][contains(text(),'Interstellar Main Theme - Extra Extended - Soundtr')]"));
        Assert.assertTrue(videoUploader.getText().contains("Soundtrack"));



        //Assert if video is paused
        WebElement videoPlayer = driver.findElement(By.xpath("//button[@title='Pause (k)']"));
        boolean isVideoPaused = videoPlayer.isSelected();
        Assert.assertFalse(isVideoPaused);

    }
}