package P02locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02FindElements {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        List<WebElement>LinkListesi=driver.findElements(By.tagName("a"));

        System.out.println("link sayisi"+ LinkListesi.size());

        driver.close();
    }
}
