package aqa_hw_17;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInAndPrimeTests extends BaseTest {

    @Test(groups = "positive", dataProvider = "getPrimeSubscriptionData", dataProviderClass = ProvideData.class)

    public void verifyPrimeSubscriptionPlansDisplayed(String primePlan) {

        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement primeElement = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Prime')]")));
        primeElement.click();

        WebElement seeMorePlans = driver.findElement(By.xpath("//a[contains(text(),'See more plans')]"));
        seeMorePlans.click();

        WebElement subscriptionPlan = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'" + primePlan + "')]")));

        Assert.assertTrue(subscriptionPlan.isDisplayed());
    }

    @Test(groups = "positive")

    public void verifyEmailInputIsDisplayedOnSignInPage() {

        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement signIn = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='nav-line-1-container']")));
        signIn.click();

        WebElement emailField = driver.findElement(By.xpath("//input[@id='ap_email_login']"));

        Assert.assertTrue(emailField.isDisplayed());


    }
}

