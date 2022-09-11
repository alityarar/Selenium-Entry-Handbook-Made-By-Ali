package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       driver.get("https://a.testaddressbook.com/sign_in");

       //locate emailx textbox pass and sign in

        WebElement EmailTextBoxElemet=driver.findElement(By.cssSelector("input[name='session[email]']"));
        WebElement PassTextBoxElemet=driver.findElement(By.cssSelector("input[name='session[password]']"));
        WebElement SignInElemet=driver.findElement(By.cssSelector("input[value='Sign in']"));

        EmailTextBoxElemet.sendKeys("testtechproed@gmail.com");
        PassTextBoxElemet.sendKeys("Test1234!");
        SignInElemet.click();






    }
}
