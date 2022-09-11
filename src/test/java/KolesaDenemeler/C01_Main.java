package KolesaDenemeler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://kolesa.kz/");

        WebElement legkovny=driver.findElement(By.xpath("(//span[@class='action-link'])[1]"));

        legkovny.click();


        WebElement pokazat=driver.findElement(By.xpath("(//span[@class='label js__search-form-submit-value'])[1]"));

        pokazat.click();


        WebElement ilkSira=driver.findElement(By.xpath("//div[@class='a-card__header'][1]"));
        ilkSira.click();

    }
}
