package homework09;

import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class task02  {

    @Test
    public void test(){

        // Get the path for the desktop directory
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\";
        System.out.println(desktopPath);
        String filePath = desktopPath + "test_file.txt";
        System.out.println(filePath);
        // Create a new file
        File file = new File(filePath);

        try {
            // Create the file on the desktop
            boolean isFileCreated = file.createNewFile();

            // Verify that the file is created successfully
            Assert.assertTrue(isFileCreated);

            // Check if the file exists
            boolean fileExists = file.exists();

            // Verify that the file exists
            Assert.assertTrue(fileExists);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}