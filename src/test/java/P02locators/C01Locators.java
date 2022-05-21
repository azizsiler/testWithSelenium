package P02locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazona gidip nutella aratalim

            driver.get("https://www.amazon.com");
        //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);



        //  bu locator calismadi bu locatoru alirken gozumuzden kacan detaylar olabilir
        //  aldigimiz bu locator calismazsa alternatifler denemeliyiz;
    }
}
