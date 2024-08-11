package TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='text']")).sendKeys("dubeyvineet058@gmail.com");
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='password']")).sendKeys("dubeyvineet");
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='submit']")).click();
        driver.findElement(By.linkText("Dashboard")).click();
        String Actualmsg= driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']")).getText();
        System.out.println(Actualmsg);
        System.out.println("TestCases1.Test6 passed");
        //driver.close();
    }
}
