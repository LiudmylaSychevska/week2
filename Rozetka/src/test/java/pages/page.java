package pages;

import org.openqa.selenium.WebDriver;

public abstract class page {

    public WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void openRozetkaMainPage() {
        driver.get("http://rozetka.com.ua");
    }
}
