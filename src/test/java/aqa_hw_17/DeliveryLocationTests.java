package aqa_hw_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DeliveryLocationTests extends BaseTest {

    @Test(groups = "negative")

    public void verifyInvalidEircodeShowsError() {

        String incorrectEircode = "dge745";

        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement deliveryLocation = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='nav-global-location-slot']")));
        deliveryLocation.click();

        WebElement inputEircodeField = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")));
        inputEircodeField.sendKeys(incorrectEircode);

        WebElement applyButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")));
        applyButton.click();

        WebElement errorMessage = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='a-box-inner a-alert-container glow-zipcode-error']")));

        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(groups = "positive")

    public void verifyValidEircodeUpdatesDeliveryLocation() {

        String validEircode = "D06YR90";

        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement deliveryLocation = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='nav-global-location-slot']")));
        deliveryLocation.click();

        WebElement inputEircodeField = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")));
        inputEircodeField.sendKeys(validEircode);

        WebElement applyButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")));
        applyButton.click();

        WebElement deliveryEircode = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'D06')]")));

        Assert.assertFalse(deliveryEircode.getText().isEmpty());



    }


}
