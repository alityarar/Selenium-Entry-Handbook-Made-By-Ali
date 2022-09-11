package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    /*
    1-amazon a gidip arama kusutunu locate et
    2-arama kutusunun tagName inin input oldugunu test et
    3-arama kutusnun name attribute nun degerinin field-keywords
    oldugunu test et
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- amazon a git ve arama kutusunu locate et

        driver.get("https://amazon.com");
        WebElement aramaKutusuElement=driver.findElement(By.id("twotabsearchtextbox"));

        //2-arama kutusnun tagName inin input oldugunu test edin

        String expectedTagName ="input";
        String actualTagName =aramaKutusuElement.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("tagName test passed");
        }else{
            System.out.println("tagName test failed");
        }

        String expectedTagNameDegeri="field-keywords";
        String actualTagNameDegeri=aramaKutusuElement.getAttribute("name");

        if (expectedTagNameDegeri.equals(actualTagNameDegeri)){
            System.out.println("name attribute test passed");
        }else{
            System.out.println("name attribute test failed");
        }
        driver.close();


    }
}
