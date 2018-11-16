package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServicePage extends BasePageObject {

    @FindBy(xpath = "//div[contains(text(),'Самообслуживание')]/following-sibling::div[@class='menu-body']//a")
    List<WebElement> selfService;


    public void selectMenuItem(String itemName){
        selectMenuItem(selfService, itemName);
    }
}
