package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); //Tam ekran yapma
        driver.get("https://amazon.com");
        System.out.println( "Actual title: "+driver.getTitle());
        System.out.println( "Actual url: "+driver.getCurrentUrl());
        driver.close();

    }
}
