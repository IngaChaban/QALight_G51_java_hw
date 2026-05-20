package aqa_hw_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod (alwaysRun = true)
    public void driverInit() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.ie");
        driver.manage().window().maximize();

        try {

            WebElement cookiesAcceptButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
            cookiesAcceptButton.click();

        } catch (Exception e) {

        }

    }


    @AfterMethod(alwaysRun = true)

    public void driverQuit() {
        this.driver.quit();
    }
}
