package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@data-mode='3']");

    public RealtListingPage checkCountCards (){
        int countCards = driver.findElements(card).size();
        Assert.assertEquals(countCards,21);
        return this;
    }
    public RealtListingPage checkTitle (){
        String titleText = driver.getTitle();
        Assert.assertEquals(titleText,"11466 объявлений - Продажа квартир — результаты поиска по условиям - Realt");
        return this;
    }

}
