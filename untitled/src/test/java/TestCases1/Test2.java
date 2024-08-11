package TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("d058gmailcom");
        driver.findElement(By.xpath("//div[contains(@class,'u-column2')]//input[@type='password']")).sendKeys("dubeyvineet");
        driver.findElement(By.xpath("//div[contains(@class,'u-column2')]//input[@type='submit']")).click();

        driver.close();

    }

}

