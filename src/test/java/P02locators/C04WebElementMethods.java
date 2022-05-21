package P02locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04WebElementMethods {
    public static void main(String[] args) {
         /*
        1- amazon.com'a gidip arama kutusunu locate edin
        2- arama kutusunun tagName'inin input oldugunu test edin
        3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
     */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

     String expectedTagName="input";
       String actualTagName=aramaKutusu.getTagName();

       if (actualTagName.equals(expectedTagName)){
           System.out.println("test passed");
       }else {
           System.out.println("test Faild");
       }


    //3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        
    }
}
