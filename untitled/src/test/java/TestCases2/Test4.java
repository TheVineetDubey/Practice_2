package TestCases2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        driver.findElement(By.id("dropdown")).click();
        WebElement option= driver.findElement(By.xpath("//option[@value='2']"));
        option.click();
        String option2=option.getText();
        System.out.println(option2);

        if (option2.contains("Option 2")){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("test failed");
        }

        driver.quit();



    }
}
