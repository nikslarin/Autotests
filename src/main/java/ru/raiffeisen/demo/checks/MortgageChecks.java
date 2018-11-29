package ru.raiffeisen.demo.checks;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Ктомуже;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import ru.raiffeisen.demo.pages.MortgagePage;


public class MortgageChecks {

    MortgagePage mortgagePage = new MortgagePage();

    @Тогда("(?:поле|кнопка) \"(.*)\" (?:доступна|доступно)")
    public void checkIsEnabled(String name) throws Exception {
        Assert.assertTrue("Кнопка - "+ name +" не активна", mortgagePage.getField(name).isEnabled());
    }

    public void checkFieldByValue(String name, String value) throws Exception {
        Assert.assertEquals(value, mortgagePage.getField(name).getAttribute("value"));
    }

    @Тогда("текст в поле \"(.*)\" равен \"(.*)\"")
    public void checkFieldByText(String name, String value) throws Exception {
        Assert.assertEquals(value, mortgagePage.getField(name).getText());
    }

    @Тогда("значение поля \"(.*)\" равно \"(.*)\"")
    public void checkField(String name, String value) throws Exception {
        Assert.assertEquals(value, mortgagePage.getField(name).getAttribute("value"));
    }

    @Тогда("поля заполнены значениями:")
    public void checkfillFields(DataTable fields) throws Exception {
        fields.asMap(String.class, String.class).forEach(
                (k, v) -> {
                    try {
                        checkField(k, v);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }

}
