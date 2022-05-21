package P01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02KaynakKodlari {
    public static void main(String[] args) {
        // https://www.amazon.com adresine gidn sayfanin
        // kodlari icerisinde "spend less" kelimesinin gecip gecmedigini test edin
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        String pageSource= driver.getPageSource();
        if (pageSource.contains("spend less")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Faild");
        }



    }
}
