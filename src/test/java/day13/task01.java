package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class task01 extends TestBase {

    @Test
    public void testWebTableActions() {
        // Go to URL: http://demo.guru99.com/test/web-table-element.php
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        // Find the third row of the table
        WebElement thirdRow = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]"));

        // Get the data from the second column of the third row
        WebElement secondColumn = thirdRow.findElement(By.xpath("./td[2]"));
        String data = secondColumn.getText();

        // Get all the values from the dynamic table
        WebElement dynamicTable = driver.findElement(By.xpath("//table[@class='dataTable']"));

        StringBuilder tableValues = new StringBuilder();
        for (WebElement row : dynamicTable.findElements(By.xpath("./tbody/tr"))) {
            for (WebElement cell : row.findElements(By.xpath("./td"))) {
                String value = cell.getText();
                tableValues.append(value).append(" ");
            }
            tableValues.append("\n");
        }

        // Print the table values
        System.out.println("Table Values:");
        System.out.println(tableValues);
    }
}