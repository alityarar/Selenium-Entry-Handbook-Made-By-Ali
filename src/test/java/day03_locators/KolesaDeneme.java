package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class KolesaDeneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Ekrani buyutelim
        driver.manage().window().maximize();

        //Bekleme suresini ayarlayalim
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://kolesa.kz/a/show/140325448");
        WebElement numaraAcmalik = driver.findElement(By.className("seller-phones__show-button"));
        numaraAcmalik.click();
        WebElement numara1 = driver.findElement(By.className("seller-phones__phones-list"));
        System.out.println(numara1.getText());
        //driver.close();

    }
}
