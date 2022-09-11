package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox"));

        //HTML DEN YER BULMAK ICIN
        // driver.findElement(By.LOCATORTURU) YAPARIZ

        /*
        ilerde wait konusunu daha genis olarak ele alacagiz
        Bir sayfa acilirken ilk basta sayfanin icerisinde bulunan
        elementlere gore bir yuklenme suresine ihtiyac vardir.
        veya bir webelementinin kullanilabilmesi icin
        zamana ihtiyac olabilir.
        implicityWait bize sayfanin yuklenmesi ve sayfadaki elementlere
        ulasim icin beklenecek Maximum sureyi belirleme olanagi tanir



         */

        /*/
        Thread.sleep den farki, thread javadan gelir
        ve ne olursa olsun o sure kadar bekler

         */

        //driver.close();
    }
}
