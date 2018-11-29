package ru.raiffeisen.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.raiffeisen.demo.annotation.FieldName;

import java.util.List;

public class MortgagePage extends BasePage {


    @FindBy(xpath = "//a[contains(text(),'Ипотечный калькулятор')]")
    @FieldName(name = "Ипотечный калькулятор")
    public List<WebElement> mortgageCalc;

    @FindBy(xpath = "//h1")
    @FieldName(name = "Заголовок Ипотечный калькулятор")
    public WebElement mortgageCalcHeader;

    @FindBy(xpath = "//span[@id='form_city-button']")
    @FieldName(name = "Город")
    public WebElement city;

    @FindBy(xpath = "//span[@class='checkbox-block__span']")
    @FieldName(name = "Знаю свою ипотечную программу")
    public WebElement mortgageProgram;

    @FindBy(xpath = "//span[@id='form_program-button']")
    @FieldName(name = "Вид ипотечной программы")
    public WebElement mortgageType;

    @FindBy(xpath = "//ul[@id='form_program-menu']//div[text()='Квартира на вторичном рынке']")
    @FieldName(name = "Квартира на вторичном рынке")
    public WebElement appartment;

    @FindBy(xpath = "//span[@id='form_category-button']")
    @FieldName(name = "Я являюсь")
    public WebElement clientType;

    @FindBy(xpath = "//ul[@id='form_category-menu']//div[text()='Новый клиент']")
    @FieldName(name = "Новый клиент")
    public WebElement newClient;

    @FindBy(xpath = "//ul[@id='form_documents-menu']//div[text()='Справка по форме Банка']")
    @FieldName(name = "Справка по форме Банка")
    public WebElement documentByBank;

    @FindBy(xpath = "//span[@id='form_documents-button']")
    @FieldName(name = "Уровень дохода подтверждаю")
    public WebElement income;

    @FindBy(xpath = "//input[@id='form_credit_amount']")
    @FieldName(name = "В банке возьму")
    public WebElement amount;

    @FindBy(xpath = "//input[@id='form_initial']")
    @FieldName(name = "Первоначальный взнос")
    public WebElement firstPayment;

    @FindBy(xpath = "//input[@id='form_period']")
    @FieldName(name = "Период")
    public WebElement period;

    @FindBy(xpath = "//input[@value='Рассчитать']")
    @FieldName(name = "Рассчитать")
    public WebElement calc;

    @FindBy(xpath = "//span[@class='monthly-payment']")
    @FieldName(name = "Ежемесячный платеж")
    public WebElement annualPayment;

    @FindBy(xpath = "//div[contains(text(),'Общая сумма выплат')]/following-sibling::div")
    @FieldName(name = "Общая сумма выплат")
    public WebElement amountFull;

    @FindBy(xpath = "//div[contains(text(),'Cумма выплат по процентам')]/following-sibling::div")
    @FieldName(name = "Cумма выплат по процентам")
    public WebElement amountPercent;

    @FindBy(xpath = "//div[contains(text(),'Процентная ставка')]/following-sibling::div")
    @FieldName(name = "Процентная ставка")
    public WebElement percent;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "ru.raiffeisen.demo.pages.MortgagePage");
    }

}
