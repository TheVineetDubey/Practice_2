package TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.automationtesting.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Shop")).click();
        driver.findElement(By.xpath("//img[@title='Selenium Ruby']")).click();
        driver.close();
    }
}
