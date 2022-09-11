package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        /*
        Relative Xpath() kullanimi;

        1-tag name          ---  input

        2-attribute         ---  type,id,value,name
        autocomplete,placeholder,class..

        3-attribute value   ---  type-'text'
                                 id-'twotabsearchtextbox'

        Bu uc bilesen bir araya getirilir ve unique sonucu
        veren her xpath kullanilabilir

        (//tagName[@attributeIsmi='attributeValue']) [ve gerekirse index]


        //Eger yaziyi yada yazili buton ariyorsak

        //   (//button[text()='Add Element']
        //gibi arayabiliriz, yazilar genelde unique olur


         */

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addELement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addELement.click();

        WebElement deleteButton=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("buton goruntulendi");
        }else System.out.println("buton goruntulenmedi");
        deleteButton.click();

        WebElement addRemoveButton=driver.findElement(By.xpath("//h3"));
        if (addRemoveButton.isDisplayed()) {
            System.out.println("yazi goruntulendi");
        }else System.out.println("yazi yok");

        driver.close();

        



    }
}
