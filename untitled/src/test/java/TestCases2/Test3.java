package TestCases2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        WebElement check1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement check2 =driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        boolean check1uncheck=!check1.isSelected();
        boolean check2check=check2.isSelected();

        if(check1uncheck && check2check){
            System.out.println("test Passes");

        }
        else {
            System.out.println("Test failed");
        }
    }
}
