package ru.raiffeisen.demo.steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.raiffeisen.demo.pages.BasePage;
import ru.raiffeisen.demo.pages.MortgagePage;
import ru.raiffeisen.demo.pages.utils.DriverManager;


import java.util.concurrent.TimeUnit;


public class MortgageSteps {


    MortgagePage mortgagePage = new MortgagePage();
    static String currentPageName;

    @When("загружена страница \"(.*)\"")
    public void stepPageLoaded(String pageName) {
        currentPageName = pageName;
    }


    @When("поле \"(.*)\" заполняется значением \"(.*)\"")
    public void fillField(String name, String value) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        page.fillField(name, value);
    }

    @When("загрузка страницы завершается")
    public void waitInvisibility() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 1);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='helpers-params loading']")));
    }


    @When("выполнено нажатие на \"(.*)\"")
    public void click(String name) throws Exception {
        Class example = Class.forName("ru.raiffeisen.demo.pages." + currentPageName);
        BasePage page = (BasePage) example.newInstance();
        page.click(name);
    }

    @When("ожидает в течение (\\d+) секунд")
    public void waiting(int seconds) throws InterruptedException {
        WebDriver driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    @When("выпадающий список \"(.*)\" заполняется значением \"(.*)\"")
    public void selectInput(String field, String value) throws Exception {
        WebElement element = mortgagePage.getField(field);
        mortgagePage.selectInput(element, value);
    }

    @When("поле \"(.*)\" присутствует")
    public void checkFieldIsPresent(String name) throws Exception {
        try {
            DriverManager.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Assert.assertTrue(String.format("Элемент [%s] не видимый", name), mortgagePage.getField(name).isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail(String.format("Отсутствует элемент [%s]", name));
        } finally {
            DriverManager.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

    }


    @When("заполняются поля:")
    public void fillFields(DataTable fields) throws Exception {
        fields.asMap(String.class, String.class).forEach(
                (k, v) -> {
                    try {
                        fillField(k, v);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }


}
