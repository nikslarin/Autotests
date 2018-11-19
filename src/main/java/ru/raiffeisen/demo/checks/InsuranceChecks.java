package ru.raiffeisen.demo.checks;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Ктомуже;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import ru.raiffeisen.demo.pages.InsurancePage;
import ru.raiffeisen.demo.steps.InsuranceSteps;

public class InsuranceChecks {

    InsurancePage insurancePage = new InsurancePage();

    @Тогда("(?:поле|кнопка) \"(.*)\" (?:доступна|доступно)")
    public void checkIsEnabled(String name) throws Exception {
        Assert.assertTrue("Кнопка - "+ name +" не активна", insurancePage.getField(name).isEnabled());
    }

    public void checkFieldByValue(String name, String value) throws Exception {
        Assert.assertEquals(value, insurancePage.getField(name).getAttribute("value"));
    }

    @Тогда("текст в поле \"(.*)\" равен \"(.*)\"")
    public void checkFieldByText(String name, String value) throws Exception {
        Assert.assertEquals(value, insurancePage.getField(name).getText());
    }

    @Тогда("значение поля \"(.*)\" равно \"(.*)\"")
    public void checkField(String name, String value) throws Exception {
        Assert.assertEquals(value, insurancePage.getField(name).getAttribute("value"));
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
