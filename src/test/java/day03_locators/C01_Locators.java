package day03_locators;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Ekrani buyutelim
        driver.manage().window().maximize();

        //Bekleme suresini ayarlayalim
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona gidelim
        driver.get("https://kolesa.kz/");

        //Arama yerini bulalim (Unique olani bulmaliyiz)
        WebElement aramaKutusu= driver.findElement(By.name("search_query"));

        aramaKutusu.click();
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //Keys.LEFT_CONTROL.charAt('a')+Keys.LEFT_CONTROL.charAt('c')+Keys.LEFT_CONTROL.charAt('v')+







    }
}
