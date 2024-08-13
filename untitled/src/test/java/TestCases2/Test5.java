package TestCases2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test5 {

    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Start']")).click();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        String msg=driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
        System.out.println(msg);

        if(msg.contains("Hello World")){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Failed");
        }
        driver.quit();
    }
}
