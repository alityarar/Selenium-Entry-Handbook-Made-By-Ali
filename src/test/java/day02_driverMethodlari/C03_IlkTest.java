package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C03_IlkTest {
    public static void main(String[] args) {

        /*
        www.amazon.com adresine gidin
        basligin amazon kelimesi icerdigini test edin
        https://www.amazon.com a esit oldugunu test edin
        sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        if (driver.getTitle().contains("amazon")) {
            System.out.println("iceriyor");
        } else {
            System.out.println("icermiyor");

        }
        if (driver.getCurrentUrl().equals("https://www.amazon.com/")){
            System.out.println("equals");
        }
        System.out.println( driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();
    }
}
