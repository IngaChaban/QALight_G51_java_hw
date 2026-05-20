package aqa_hw_15;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import static java.lang.Thread.sleep;

public class ScrollTopButtonVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

            sleep(3000);


            WebElement scrollButton = driver.findElement(By.xpath("//button[contains(@class,'button-scroll-top-page')]"));
            scrollButton.click();

            sleep(3000);

            Long position = (Long) js.executeScript("return window.scrollY;");
            Assert.assertEquals(Long.valueOf(0), position);

    } finally {

        driver.quit();
    }
}
}

