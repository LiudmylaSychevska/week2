package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;

public class mainMenu extends page {

    By tovaryDliadomaLink = By.xpath("//*[@id='5300']//*[@href='http://rozetka.com.ua/tovary-dlya-doma/c2394287/']");
    By tovaryDliadomaAllLink = By.xpath("//*[@class='f-menu-second clearfix']//*[@class='f-menu-cols']//*[@class='f-menu-cols-b clearfix']//*[@href='http://rozetka.com.ua/tovary-dlya-doma/c2394287/']");
    By tovaryDliadomaNewPage = By.xpath("//*[@class='pab-h1']");

    By smartphonesLink = By.xpath("//*[@id='3361']//*[@href='http://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/']");
    By smartphonesAllLink = By.xpath("//*[@href='http://rozetka.com.ua/mobile-phones/c80003/filter/preset=smartfon/']");
    By smartphonesNewPage = By.xpath("//*[normalize-space(@class)='title-page-with-filters-wrap']//*[@itemprop='name']");
    By smartphoneList = By.xpath("//*[@class='g-i-tile-i-box-desc']//*[@class='g-i-tile-i-title clearfix']");


    public void clickTovaryDliadomaLink() {
        driver.findElement(tovaryDliadomaLink).click();
        WebElement dynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(tovaryDliadomaAllLink));
    }

    public void clickAllCategoriesLink() {
        driver.findElement(tovaryDliadomaAllLink).click();
        Assert.assertEquals("Wrong Tovary_Dlia_Doma page opened",driver.findElement(tovaryDliadomaNewPage).getText(), "Товары для дома");
    }

    public void clickSmartphonesLink() {
        driver.findElement(smartphonesLink).click();
        WebElement dynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(smartphonesAllLink));
    }

    public void clickSmartphonesAllLink() {
        driver.findElement(smartphonesAllLink).click();
        Assert.assertEquals("Wrong Smartphones page opened", driver.findElement(smartphonesNewPage).getText(), "Все смартфоны");
    }

    public void findSmartphoneList() throws FileNotFoundException {
        Formatter smartphoneListFile = new Formatter("smartphones.txt");
        List<WebElement> rows = driver.findElements(smartphoneList);
        Iterator<WebElement> iter = rows.iterator();
        while (iter.hasNext()) {
            WebElement item = iter.next();
            String label = item.getText();
            System.out.println(label);
            smartphoneListFile.format("%s\n",label);
        }
        smartphoneListFile.close();
    }
}
