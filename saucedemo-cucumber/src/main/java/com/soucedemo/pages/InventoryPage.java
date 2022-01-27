package com.soucedemo.pages;

import com.soucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage extends Utility {
    // For logging, we're declaring variable of Logger class from Log4J2
    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    // with this constructor, we initialize all the page object with initElement method of PageFactory class
    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement productSortTab;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> allProducts;
    @CacheLookup
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    WebElement cartButton;

    public void sortTheProductsHighToLowPrice(String priceHighToLow){
        pmSelectByVisibleTextFromDropDown(productSortTab,priceHighToLow);
        log.info("Sorting the products by prices: " + priceHighToLow);
    }
    public void addHighestAndLowestPricedProductsToBasket(){

        for (int i=0; i<allProducts.size();i++) {
            if(i==0 || i== allProducts.size()-1){
                pmWaitWithThreadSleep(20);
                pmClickOnElement(allProducts.get(i));
                log.info("Adding product to the cart: " + allProducts.get(i).toString());
            }

        }
    }
    public void clickOnCart() {
        log.info("Clicking on the cart button: " + cartButton.toString());
        pmClickOnElement(cartButton);
    }
}
