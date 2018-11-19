package ru.raiffeisen.demo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.demo.annotation.FieldName;
import ru.raiffeisen.demo.utils.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class InsurancePage extends BasePageObject {

    @FindBy(xpath = "//a[@href='/retail/insurance/everyday/travel/vbc/']")
    @FieldName(name = "В путешествие")
    public WebElement vacationBtn;

    @FindBy(xpath = "//div[@class='b-intro__block-buttons']//a[contains(text(),'Оставить заявку')]")
    @FieldName(name = "Оставить заявку")
    public WebElement requestBtn;

    @FindBy(xpath = "//div[@class='b-block-text container']//h1")
    @FieldName(name = "Форма заявки на страховую программу")
    public WebElement insuranceForm;

    @FindBy(xpath = "//span[@role='combobox']//span[2]")
    @FieldName(name = "Вояж (Комфорт/Бизнес класс/Первый класс)")
    public WebElement voyage;

    @FindBy(xpath = "//input[@placeholder='Фамилия']")
    @FieldName(name = "Фамилия")
    public WebElement surname;

    @FindBy(xpath = "//input[@placeholder='Имя']")
    @FieldName(name = "Имя")
    public WebElement name;

    @FindBy(xpath = "//input[@placeholder='Отчество']")
    @FieldName(name = "Отчество")
    public WebElement middleName;

    @FindBy(xpath = "//input[@placeholder='Дата Рождения']")
    @FieldName(name = "Дата рождения")
    public WebElement birthDate;

    @FindBy(xpath = "//input[@placeholder='Электронная почта']")
    @FieldName(name = "Электронная почта")
    public WebElement email;

    @FindBy(xpath = "//div[text()='Номер телефона']/preceding-sibling::input")
    @FieldName(name = "Телефон")
    public WebElement phone;

    @FindBy(xpath = "//input[@data-label='Согласие на обработку персональных данных']/parent::label//span")
    @FieldName(name = "Согласие на обработку персональных данных")
    public WebElement agreement;

    @FindBy(xpath = "//input[@placeholder='Проверочный код']")
    @FieldName(name = "Проверочный код")
    public WebElement checkCode;

    @FindBy(xpath = "//button[@type='submit']")
    @FieldName(name = "Отправить")
    public WebElement submitBtn;

    }

