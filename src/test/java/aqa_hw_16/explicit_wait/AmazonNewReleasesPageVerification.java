package aqa_hw_16.explicit_wait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonNewReleasesPageVerification {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://www.amazon.ie/");
            driver.manage().window().maximize();


            WebElement cookiesAcceptButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
            cookiesAcceptButton.click();

            WebElement categoriesMenu = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nav-hamburger-menu']")));
            categoriesMenu.click();

            WebElement newRelease = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'New Releases')]")));
            newRelease.click();

            WebElement page = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@id='zg_banner_text']")));

            Assert.assertTrue(page.isDisplayed());

        } finally {

            driver.quit();
        }
    }
}