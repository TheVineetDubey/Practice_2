package TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test7 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Shop")).click();
        WebElement bar=driver.findElement(By.xpath("//div[contains(@class='slider-range')]"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(bar,-150,0).build();
        driver.findElement(By.xpath("//button[@class='submit']")).click();
        System.out.println("TestCases1.Test6 passed");
        //driver.close();
    }
}
