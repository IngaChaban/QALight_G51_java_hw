package aqa_hw_16.fluent_wait;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;


public class AmazonCartCountVerification {
    public static void main(String[] args)  {

        String searchWord = "toothbrush";

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

            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
            inputField.sendKeys(searchWord, Keys.ENTER);

            WebElement toothbrush = wait.until(ExpectedConditions.elementToBeClickable
                    (By.xpath("(//span[@data-component-type='s-product-image']//a[@class='a-link-normal s-no-outline'])[1]")));
            toothbrush.click();

            WebElement addToBasketButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='add-to-cart-button']")));
            addToBasketButton.click();

            WebElement cartCount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='nav-cart-count']")));

            String updatedCart = cartCount.getText();

            Assert.assertEquals("1", updatedCart);

        } finally {

            driver.quit();
        }
    }
}