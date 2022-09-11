package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {
    public static void main(String[] args) throws InterruptedException {
        /*
    En ilkel haliyle bir otomasyon yapmak için
    Classimiza otomasyon için gerekli olan
    webdriver in yerini göstermeliyiz.
    Bunun için Java kütüphanesinden
    System.setProperty() methodu kullanırız

    Bu method 2 parametre ister
    Birincisi kullanilacak driver; webdriver.chrome.driver
    Ikincisi ise bu driver in fiziki yolu


         */

        //******ONEMLI BURASI********
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");
        Thread.sleep(800);
        //driver.quit();
        //driver.get("https://amazon.com");
        //driver.wait(200);
        driver.close();
        //driver.get("https://youtube.com");

    }
}
