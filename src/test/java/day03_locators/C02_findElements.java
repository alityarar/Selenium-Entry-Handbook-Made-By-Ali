package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {

        // Amazon sayfasinda kac tane link bulundugunu yazdiralim

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://youtube.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        List<WebElement> linkListesi= driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki link sayisi : " + linkListesi.size());

        driver.close();

    }
}
