package ru.raiffeisen.demo.steps;

import org.junit.Assert;
import ru.raiffeisen.demo.pages.DepositPage;
import ru.raiffeisen.demo.pages.InsurancePage;

public class InsuranceSteps {

    InsurancePage insurancePage = new InsurancePage();


    public void fillField(String name, String value) throws Exception {
        insurancePage.fillField(name, value);
    }

    public void click(String name) throws Exception {
        insurancePage.click(name);
    }

}