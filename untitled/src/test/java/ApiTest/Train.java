package ApiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Train {
    WebDriver driver;
    public void selectStation() {
        driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        WebElement stationFrom = driver.findElement(By.id("txtStationFrom"));
        stationFrom.clear();
        stationFrom.sendKeys("DEL");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='autocomplete']/div[4]")));

        WebElement station4 = driver.findElement(By.xpath("//div[@class='autocomplete']/div[4]"));
        String station4name = station4.getText();
        System.out.println("Station 4 Name: " + station4name);
        station4.click();
    }
        public void select30DaysFromToday() {
            WebElement dateField = driver.findElement(By.xpath("//input[@title='Select Departure date for availability']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='" + getDate30DaysFromToday() + "';", dateField);
        }

        private String getDate30DaysFromToday() {
            LocalDate date = LocalDate.now().plusDays(30);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy");
            return date.format(formatter).toUpperCase();
        }

    public static void main(String[] args) {
        Train train = new Train();
        System.out.println("Test begins...");
        train.selectStation();             // Select the station
        train.select30DaysFromToday();     // Select a date 30 days from today

        System.out.println("Test ends...");


    }


    }

