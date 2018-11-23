package demo_new.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import demo_new.annotation.FieldName;
import demo_new.utils.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;


public class TransferResult extends BasePage {


    @FindBy(xpath = "//*[text()='ФИО получателя:']/following-sibling::div")
    @FieldName(name = "ФИО получателя")
    public WebElement fio;


    @FindBy(xpath = "//*[text()='Сумма перевода:']/following-sibling::div")
    @FieldName(name = "Сумма перевода")
    public WebElement amount;

    @FindBy(xpath = "//*[text()='Комиссия']/following-sibling::div")
    @FieldName(name = "Комиссия")
    public WebElement commission;


    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "demo_new.pages.TransferResult");
    }




}