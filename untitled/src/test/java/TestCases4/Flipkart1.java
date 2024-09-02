package TestCases4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Flipkart1 {

    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod

    public  void setup() {

       driver = new ChromeDriver();
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
     public  void validateprice(){
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.xpath("//div[@class='_2L0uxW']//div[@class='_3ETuFY']//img[@alt='Mobiles']")).click();
     driver.findElement(By.xpath("//input[@type='text' and @class='zDPmFV']")).sendKeys("Apple iphone 15 pro max");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='tUxRFH']//div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR'])[1]")));
        String price = priceElement.getText();

         System.out.println(price);

         if (price.equals("₹1,84,900")) {
             System.out.println("Price verification successful!");
         } else {
             System.out.println("Price verification failed!");
         }

    }
    @AfterTest

    public void close() {
        driver.quit();
    }
}