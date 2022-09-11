package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearcher {
    public static void main(String[] args) {

        /*
        1-google a gidip amazona girin
        2-ara kismina city bike yazin
        3-amazonda goruntulenen ilgili sonuclarin
        sayisini yazdirin
        4-sonra karsiniza cikan ilk sonucun resmine tiklayin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

        WebElement aramaTusu= driver.findElement(By.id("twotabsearchtextbox"));

        aramaTusu.sendKeys("city bike"+ Keys.ENTER);

        //Eger o elementten fazla varsa ve
        //ve biz ilkini kullanmak istersek

        //List<WebElement> istenenElementListesi=driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));
       // WebElement sonucYazisiElementi = istenenElementListesi.get(0);
        ///System.out.println(sonucYazisiElementi.getText());

        List<WebElement> urunResimleriListesi= driver.findElements(By.className("a-section aok-relative s-image-fixed-height"));
        WebElement ilkUrunResmi=urunResimleriListesi.get(1);


        driver.close() ;

    }
}
