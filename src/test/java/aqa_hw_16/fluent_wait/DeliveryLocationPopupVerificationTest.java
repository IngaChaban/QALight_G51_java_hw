package aqa_hw_16.fluent_wait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DeliveryLocationPopupVerificationTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        try {
            driver.get("https://www.amazon.ie/");
            driver.manage().window().maximize();

            WebElement cookiesAcceptButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
            cookiesAcceptButton.click();

            WebElement deliveryLocation = driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
            deliveryLocation.click();

            WebElement chooseYourLocationPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//div[@class='a-popover-wrapper GLUX_Popover']")));
           Assert.assertTrue(chooseYourLocationPopUp.isDisplayed());


        } finally {

            driver.quit();
        }
    }
}