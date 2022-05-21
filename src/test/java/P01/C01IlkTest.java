package P01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01IlkTest {

    //1- https://www.amazon.com url'ine gidin
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        //2- Basligin Amazon kelimesi icerdigini test edin
        String actualUrl= driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Faild");
        }
        // 3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualAdres= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualAdres.contains(expectedUrl)){
            System.out.println("test passed");
        }else System.out.println("Test faild");

        // 4- sayfayi kapatin
        driver.close();
    }
}
