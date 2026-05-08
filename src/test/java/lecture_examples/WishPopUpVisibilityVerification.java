package lecture_examples;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class WishPopUpVisibilityVerification {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://hotline.ua");
            driver.manage().window().maximize();

            WebElement wishListButton = driver.findElement(By.xpath("//div[@class='popover my-lists']"));
            wishListButton.click();

            sleep(3000);

            WebElement wishListPopUp = driver.findElement(By.xpath("//div[@class='profile-sidebar__section-content flex-column']"));


            Assert.assertTrue("Wishlist popup isn't displayed", wishListPopUp.isDisplayed());

        } finally {

            driver.quit();
        }

    }
}
