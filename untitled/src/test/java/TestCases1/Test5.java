package TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='text']")).sendKeys("");
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='password']")).sendKeys("dubeyvineet");
        driver.findElement(By.xpath("//div[contains(@class,'u-column1')]//input[@type='submit']")).click();
        String Actualmsg=driver.findElement(By.xpath("//ul[@class='woocommerce-error']")).getText();
        System.out.println(Actualmsg);
        System.out.println("Test 5 Passed");
        driver.close();
    }
}
