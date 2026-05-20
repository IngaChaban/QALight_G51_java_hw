package aqa_hw_15;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class LegoCategoriesMenuVerification {
    public static void main(String[] args) throws InterruptedException {

        List<String> searchWords = List.of("Вік", "Серії", "Інтереси");

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement catalogueButton = driver.findElement(By.xpath("//div[@class='header-catalog-button']"));
            catalogueButton.click();

            sleep(3000);

            WebElement legoMenuItem = driver.findElement(By.xpath("//a[contains(@href,'constructors-lego') and contains(.,'LEGO')]"));

            legoMenuItem.click();

            sleep(3000);

            WebElement categoryWindow = driver.findElement(By.xpath("//ul[@class='category-navigation content']"));

            for (String word : searchWords) {

                WebElement categories = categoryWindow.findElement(
                        By.xpath(".//*[contains(text(),'" + word + "')]"));

                Assert.assertTrue("The categories isn't displayed",categories.isDisplayed());
            }

            } finally{
                driver.quit();
            }
        }
    }


