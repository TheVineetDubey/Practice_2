package TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test9 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Shop")).click();
        WebElement option= driver.findElement(By.xpath("//select[@name='orderby']//option[@value='popularity']"));
        option.click();
        System.out.println("TestCases1.Test9 passed");

        //driver.close();
    }
}
