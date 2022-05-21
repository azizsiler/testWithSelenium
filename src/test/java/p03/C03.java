package p03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class C03 {
    /*
     //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
       ;
        //  b. Locate email textbox

        //  c. Locate password textbox ve

        //  d. Locate signin button

        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com/sign_in");

      WebElement emailKutusu= driver.findElement(By.xpath("//input[@type='email']"));

      WebElement  passwordKutusu=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));

      WebElement sinIng= driver.findElement(By.xpath("//input[@type='submit']"));

      emailKutusu.sendKeys("testtechproed@gmail.com");

        passwordKutusu.sendKeys("Test1234!");

        sinIng.click();




    }
}
