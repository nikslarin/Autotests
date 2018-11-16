package ru.raiffeisen.demo.checks;

import org.junit.Assert;
import ru.raiffeisen.demo.pages.InsurancePage;
import ru.raiffeisen.demo.steps.InsuranceSteps;

public class InsuranceChecks {


    InsurancePage insurancePage = new InsurancePage();

    public void checkIsEnabled(String name) throws Exception {
        Assert.assertTrue("Кнопка - "+ name +" не активна", insurancePage.getField(name).isEnabled());
    }

    public void checkField(String name, String value) throws Exception {
        Assert.assertEquals(value, insurancePage.getField(name).getAttribute("value"));
    }


}
