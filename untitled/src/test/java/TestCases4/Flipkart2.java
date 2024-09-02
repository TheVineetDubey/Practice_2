package TestCases4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class Flipkart2 {

    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public  void setup() {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public  void validate(){
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2L0uxW']//div[@class='_3ETuFY']//img[@alt='Mobiles']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @class='zDPmFV']")).sendKeys("Apple iphone 15 pro max");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        List<WebElement> mobileNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='KzDlHZ']")));
        List<WebElement> mobilePrices = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='Nx9bqj _4b5DiR']")));
        Map<String, Integer> mobilePriceMap = new HashMap<>();


        for (int i = 0; i < mobileNames.size(); i++) {
            String name = mobileNames.get(i).getText();
            String priceText = mobilePrices.get(i).getText();
            priceText = priceText.replaceAll("[^0-9]", "");
            int price = Integer.parseInt(priceText);
            mobilePriceMap.put(name, price);
        }

        // Sort the map by value
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mobilePriceMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Mobile Price Map: " + sortedMap);

        int highestPrice = sortedMap.values().stream().mapToInt(v -> v).max().orElse(-1);
        if (highestPrice == 199900) {
            System.out.println("Highest price is ₹1,99,900 as expected.");
        } else {
            System.out.println("Highest price is not ₹1,99,900. It is ₹" + highestPrice);
        }
    }
    @AfterMethod
    public void tearDown() {

            driver.quit();

    }
}





