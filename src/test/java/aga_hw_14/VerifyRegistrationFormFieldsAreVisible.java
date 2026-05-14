package aga_hw_14;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class VerifyRegistrationFormFieldsAreVisible {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua");
            driver.manage().window().maximize();


            WebElement userButton = driver.findElement(By.xpath("//div[@class='user-button__image flex middle-xs center-xs']"));

            userButton.click();

            sleep(2000);

            WebElement registerForm = driver.findElement(By.xpath("//a[@class='template-page__link']"));

            registerForm.click();

            sleep(5000);

            WebElement emailOrPhoneField = driver.findElement(By.xpath("//input[@id='login']"));

            WebElement userNameField = driver.findElement(By.xpath("//input[@id='name']"));

            WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));

            WebElement registerButton = driver.findElement(By.xpath("//button[@type='submit']"));

           Assert.assertTrue("E-mail/phone number field isn't displayed",emailOrPhoneField.isDisplayed());
           Assert.assertTrue("User name field isn't displayed",userNameField.isDisplayed());
           Assert.assertTrue("Password field isn't displayed",passwordField.isDisplayed());
           Assert.assertTrue("Register button is not displayed",registerButton.isDisplayed());
        } finally {

            driver.quit();
        }

    }
}
