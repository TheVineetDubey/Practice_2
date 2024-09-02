package TestCases4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Flipkart3 {

            WebDriver driver;
            WebDriverWait wait;
            @BeforeMethod
            public  void setup() {

                driver = new ChromeDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                driver.manage().window().maximize();
            }
            @Test
            public  void electronics() throws IOException {
                driver.get("https://www.flipkart.com/");

                try {
                    Actions actions = new Actions(driver);
                    actions.sendKeys(Keys.ESCAPE).perform();
                } catch (TimeoutException e) {
                    System.out.println("Login popup did not appear.");
                }


                driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
                driver.findElement(By.xpath("//a[text()='Home Theatres']")).click();
                WebElement productLink = driver.findElement(By.xpath("//a[@title='PHILIPS SPA5128B/94 40 W Bluetooth Home Theatre']"));



                Actions actions = new Actions(driver);
                actions.keyDown(Keys.CONTROL).click(productLink).keyUp(Keys.CONTROL).build().perform();

                // Switch to the new tab
                String originalHandle = driver.getWindowHandle();
                for (String handle : driver.getWindowHandles()) {
                    if (!handle.equals(originalHandle)) {
                        driver.switchTo().window(handle);
                        break;
                    }
                }

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PHILIPS SPA5128B/94 40 W Bluetooth Home Theatre']")));

                TakesScreenshot scrShot =((TakesScreenshot) driver);
                File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
                File DestFile=new File("src/test/HomeTheater.png");
                FileUtils.copyFile(SourceFile, DestFile);

                driver.findElement(By.xpath("//button[text()='Read More']")).click();


                WebElement table = driver.findElement(By.xpath("(//table[@class='_0ZhAN9'])[2]"));

                // Extract rows from the table
                List<WebElement> rows = table.findElements(By.tagName("tr"));
                Map<String, String> productDetailsMap = new HashMap<>();

                // Iterate over rows to extract key-value pairs
                for (WebElement row : rows) {
                    List<WebElement> cells = row.findElements(By.tagName("td"));
                    if (cells.size() == 2) { // Ensure it's a key-value pair row
                        String key = cells.get(0).getText().trim();
                        String value = cells.get(1).getText().trim();
                        productDetailsMap.put(key, value);
                    }
                }

                // Output the product details map
                System.out.println("Product Details Map: " + productDetailsMap);

                // Verify that the product is compatible with Tablet
                if (productDetailsMap.get("Compatible Devices").contains("Tablet")) {
                    System.out.println("The product is compatible with Tablet.");
                } else {
                    System.out.println("The product is not compatible with Tablet.");
                }
            }

            @AfterMethod
            public void tearDown() {

                driver.quit();
            }
        }