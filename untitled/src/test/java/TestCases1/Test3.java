package TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test3 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='text']")).sendKeys("dubeyvineet058@gmail.com");
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='password']")).sendKeys("dubeyvineet");
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='submit']")).click();
        String Actualmsg=driver.findElement(By.linkText("Dashboard")).getText();
        System.out.println(Actualmsg);
        String Expectedmsg="Dashboard";
        Assert.assertEquals(Expectedmsg,Actualmsg);
        System.out.println("TestCases1.Test3 passed");
        driver.close();
    }
}
