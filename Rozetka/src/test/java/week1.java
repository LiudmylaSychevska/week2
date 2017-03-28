import org.junit.Test;
import pages.mainMenu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;

public class week1 extends setUpTest {

    @Test
    public void homeGoodsTest() {

        System.out.println("TEST: Tovary dlia doma");

        mainMenu rozetkaSite = new mainMenu();
        rozetkaSite.setDriver(driver);

        //open rozetka site
        rozetkaSite.openRozetkaMainPage();

        //click element "Tovary dlya doma"
        rozetkaSite.clickTovaryDliadomaLink();
        System.out.println("Web element found: tovary dlia doma");

        //click element "Vse kategorii" in "tovary dlia doma" section
        rozetkaSite.clickAllCategoriesLink();
        System.out.println("Web element found: all categories");

        //time for user to see the opened page
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    @Test
    public void smartphoneTest() throws FileNotFoundException {

        System.out.println("TEST: Smartphone");

        mainMenu rozetkaSite = new mainMenu();
        rozetkaSite.setDriver(driver);

        //open rozetka site
        rozetkaSite.openRozetkaMainPage();

        //click element "Smartphones, TV, electronics"
        rozetkaSite.clickSmartphonesLink();
        System.out.println("Web element found: Smartphones, TV, electronics");

        //click element Smartphones in ""Smartphones, TV.." section
        rozetkaSite.clickSmartphonesAllLink();
        System.out.println("Web element found: Smartphones");

        //write smartphoneList to console and file
        rozetkaSite.findSmartphoneList();

        //time for user to see the opened page
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

}
