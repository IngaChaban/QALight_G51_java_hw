package aqa_hw_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class YouTubeTabVerification {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();
            WebElement youTubeButton = driver.findElement(By.xpath("//a[@title='Youtube']"));
            youTubeButton.click();

            sleep(3000);

            List<String> tabIds = driver.getWindowHandles().stream().toList();
            String lastTabId = tabIds.get(tabIds.size() -1);
            driver.switchTo().window(lastTabId);

            WebElement hotlineLogo = driver.findElement(By.xpath("//img[contains(@class,'ytCoreImageHost') and contains(@src,'googleusercontent.com')]"));

            sleep(3000);

            Assert.assertTrue(hotlineLogo.isDisplayed());

        }finally {
            driver.quit();

        }
    }
}