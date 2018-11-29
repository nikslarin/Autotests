package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class MainPage extends BasePage{


    @FindBy(xpath = "//ul[@class='main-menu']//li")
    public List<WebElement> topMenu;


    @FindBy(xpath = "//*[text()='Да']")
    public WebElement acceptRegion;


    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "MainPage");
    }
}