package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //maximize iken konum ve boyutu alalim

        System.out.println("max konum"+driver.manage().window().getPosition());
        System.out.println("max size"+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        //fullscreen iken boyutlarini alalim

        System.out.println("fullscrn konum"+driver.manage().window().getPosition());
        System.out.println("fullscrn boyut"+driver.manage().window().getSize());
        //driver.close();
    }
}
