package P04JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
WebElement singIn= driver.findElement(By.xpath("//button[@id='signin_button']"));
singIn.click();
        //3. Login alanine  “username” yazdirin
WebElement LoginAlani= driver.findElement(By.xpath("//input[@type='text']"));
LoginAlani.sendKeys("username");
        //4. Password alanine “password” yazdirin
        WebElement PasswordAlani= driver.findElement(By.xpath("//input[@type='password']"));

        PasswordAlani.sendKeys("password");
Thread.sleep(10000);
        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
WebElement SinInButon= driver.findElement(By.xpath("//input[@type='submit']"));
SinInButon.click();
driver.navigate().back();
        //6. Online Banking menusunden Pay Bills sayfasina gidin

WebElement OnlineBanking= driver.findElement(By.xpath("//strong[.='Online Banking']"));
OnlineBanking.click();

WebElement PayBills= driver.findElement(By.xpath("(//span[@class='headers'])[4]"));
PayBills.click();
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amount= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        amount.sendKeys("1000 $");

        //8. tarih kismina “2020-09-10” yazdirin
        WebElement Tarih= driver.findElement(By.xpath("//input[@id='sp_date']"));
        Tarih.sendKeys("2020-09-10");

        //9. Pay buttonuna tiklayin
        WebElement Pay= driver.findElement(By.xpath("//input[@type='submit']"));
        Pay.click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini kontrol edin
        WebElement SonucYazidi= driver.findElement(By.xpath("//span[@title='$ 1000 $ payed to payee sprint']"));
        System.out.println("SonucYazidi.isDisplayed() = " + SonucYazidi.isDisplayed());

        driver.close();


    }
}
