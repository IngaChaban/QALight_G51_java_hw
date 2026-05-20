package aqa_hw_17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShoppingCartTests extends BaseTest {

    @Test(groups = "positive")

    public void verifyProductQuantityInCartUpdatesCorrectly() {

        String productName = "travel mug";

        WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement inputField = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));

        inputField.sendKeys(productName, Keys.ENTER);

        WebElement product = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-component-type='s-search-result']//a[.//h2])[1]")));
        product.click();

        WebElement addToBasketButton = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToBasketButton.click();

        WebElement basket = driver.findElement(By.xpath("//a[@id='nav-cart']"));
        basket.click();

        WebElement increaseQuantityButton = waiter.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-a-selector='increment']")));
        increaseQuantityButton.click();

        WebElement cartQuantityValue = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-a-selector='inner-value']")));

        String quantity = cartQuantityValue.getText();

        Assert.assertEquals(quantity, "2");

    }
}
