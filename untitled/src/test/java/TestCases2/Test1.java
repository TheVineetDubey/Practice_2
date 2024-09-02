package TestCases2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class Test1 {
    public static void main(String[] args) throws IOException {

        WebDriver driver =new ChromeDriver();
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 17000);");

        TakesScreenshot scrShot =((TakesScreenshot) driver);
        File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("src/test/screenshot1.png");
        FileUtils.copyFile(SourceFile, DestFile);


        driver.findElement(By.xpath("//i[@class='fa fa-angle-up']")).click();

        //WebDriverWait wait = new WebDriverWait(driver, (100));


        TakesScreenshot scrShot1 =((TakesScreenshot) driver);
        File SourceFile1=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile1=new File("src/test/screenshot2.png");
        FileUtils.copyFile(SourceFile1, DestFile1);



        driver.close();
    }
}
