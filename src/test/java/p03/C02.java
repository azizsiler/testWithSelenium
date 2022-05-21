package p03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
      /*
         1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */
      public static void main(String[] args) {
          WebDriverManager.chromedriver().setup();
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

          driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
         WebElement button=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
         button.click();

         String expectedYazi="Delete";

         String gercekYazi=driver.findElement(By.xpath("//button[@class='added-manually']")).getText();
          Assert.assertTrue(expectedYazi.equals(gercekYazi));
          System.out.println(gercekYazi);

      }
}
