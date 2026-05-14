package aqa_hw_16.implicit_wait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class SearchSuggestionVerification {
    public static void main(String[] args) throws InterruptedException{

        String searchWord = "shampoo";

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://www.amazon.ie/");
            driver.manage().window().maximize();


            WebElement cookiesAcceptButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
            cookiesAcceptButton.click();

            WebElement inputField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            inputField.sendKeys(searchWord);

            List<WebElement> suggestions = driver.findElements(By.xpath("//div[@role='button' and contains(@class,'s-suggestion')]"));
            Assert.assertFalse(suggestions.isEmpty());

        } finally {

            driver.quit();
        }
    }
}