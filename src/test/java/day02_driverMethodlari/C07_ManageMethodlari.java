package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class C07_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println(driver.manage().window().getPosition());
        //konumu alma


        //yeni konum belirleme
        driver.manage().window().setPosition(new Point(500,15));

        //yeni size belirleme
        driver.manage().window().setSize(new Dimension(1600,600));
        driver.close();
    }
}
