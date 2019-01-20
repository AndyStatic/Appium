package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CalculatorMainPage;

public class AppiumTest extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void sumTest() throws InterruptedException {
        new CalculatorMainPage(driver).sum();
    }

    @Test
    public void subtractTest() throws InterruptedException {
        new CalculatorMainPage(driver).subtract();
    }

}
