package ru.raiffeisen.demo.steps;

import org.junit.Assert;
import ru.raiffeisen.demo.pages.DepositPage;


public class DepositSteps {

    DepositPage depositPage = new DepositPage();


    public void fillField(String name, String value) throws Exception {
        depositPage.fillField(name, value);
    }

    public void checkField(String name, String value) throws Exception {
        Assert.assertEquals(value, depositPage.getField(name).getAttribute("value"));
    }

    public void checkIsEnabled(String name) throws Exception {
        Assert.assertTrue("Кнопка - "+ name +" не активна", depositPage.getField(name).isEnabled());
    }

    public void click(String name) throws Exception {
        depositPage.click(name);
    }

}