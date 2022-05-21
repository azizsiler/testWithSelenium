package P04JUnit;

import TestBase.TestBase;
import org.junit.Test;

public class C02 extends TestBase {
    @Test
    public void test01(){
        driver.get("https://amazon.com");
    }
}
