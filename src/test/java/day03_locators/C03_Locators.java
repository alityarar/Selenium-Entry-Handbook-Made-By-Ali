package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
        /*
        1-https://a.testadressbook.com adresine gidin
        2-Sign in butonuna basin
        3-email textbox,password textbox ve signing button
        elementlerini locate edin
        4-kullanici adi ve sifreyi girip tiklayin
        username;testtechproed@gmail.com
        password; Test1234!
        5-Expected user id nin testtechproed@gmail.com oldugunu dogrurlayin
        6-"adresses" ve "sign out" textlerinin goruntulendigini
        dogrulayin
        7-sayfada kac link oldugunu bulun

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://a.testaddressbook.com");

        //sign in butonu
        WebElement signinButton= driver.findElement(By.id("sign-in"));
        signinButton.click();
        //mail location and fill
        WebElement emailButton=driver.findElement(By.id("session_email"));
        emailButton.click();
        emailButton.sendKeys("testtechproed@gmail.com");
        //password location and fill
        WebElement passwButton=driver.findElement(By.id("session_password"));
        passwButton.click();
        passwButton.sendKeys("Test1234!");
        //sign in button
        WebElement signbutton=driver.findElement(By.name("commit"));
        signbutton.click();

        //expected user name verify
        WebElement goruntulenenUserElement= driver.findElement(By.className("navbar-text"));
        System.out.println(goruntulenenUserElement.getText());
        String goruntulenenUser=goruntulenenUserElement.getText();
        if (goruntulenenUser.equals("testtechproed@gmail.com")){
            System.out.println("Verified User");
        }else{
            System.out.println("User verify error");
        }

        //Adress button verify
        WebElement adresCheckElemet=driver.findElement(By.linkText("Addresses"));
        String adresCheck=adresCheckElemet.getText();
        if (adresCheck.equalsIgnoreCase("Addresses")){
            System.out.println("Adres verified");
        }else{
            System.out.println("Adres verify error");
        }

        //Sign out verify
        WebElement signCheckElement=driver.findElement(By.linkText("Sign out"));
        String signCheck=signCheckElement.getText();
        if (signCheck.equals("Sign out")){
            System.out.println("Sign out verified");
        }else{
            System.out.println("Sign out error");
        }

        //DISPLAYED YER BURASI
        if (signCheckElement.isDisplayed()){
            System.out.println("Sign Displayed");
        }else {
            System.out.println("Sign not displayed");
        }

        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));
        System.out.println("Link sayisi : "+linkListesi.size());


        driver.close();
    }
}
