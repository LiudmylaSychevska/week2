import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class setUpTest {

    protected WebDriver driver;

    @Before
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:/test/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    @After
    public void Termination() {
        driver.close();
        driver.quit();
    }
}
