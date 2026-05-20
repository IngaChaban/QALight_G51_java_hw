package aqa_hw_16.explicit_wait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonSignInNegativeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://www.amazon.ie/");
            driver.manage().window().maximize();

            WebElement cookiesAcceptButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
            cookiesAcceptButton.click();

            WebElement accountLists = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='nav-link-accountList']")));
            accountLists.click();

            WebElement continueButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='a-button-input']")));
            continueButton.click();
            WebElement warningMassage = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Enter your mobile number or email')]")));
            Assert.assertTrue(warningMassage.isDisplayed());

        } finally {

            driver.quit();
        }
    }
}

