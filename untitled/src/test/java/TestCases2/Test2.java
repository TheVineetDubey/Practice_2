package TestCases2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        String columnAText1 = driver.findElement(By.id("column-a")).getText();
        String columnBText1 = driver.findElement(By.id("column-b")).getText();

        WebElement sourceElement = driver.findElement(By.id("column-a"));  // Replace with actual locator
        WebElement targetElement = driver.findElement(By.id("column-b"));  // Replace with actual locator
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).perform();

        String columnAText = driver.findElement(By.id("column-a")).getText();
        String columnBText = driver.findElement(By.id("column-b")).getText();

        if (columnBText1.equals(columnAText) && columnAText1.equals(columnBText)) {
            System.out.println("Test Passed: Columns swapped correctly.");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}
