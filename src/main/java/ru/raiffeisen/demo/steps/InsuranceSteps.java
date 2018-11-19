package ru.raiffeisen.demo.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import org.junit.Assert;
import ru.raiffeisen.demo.pages.DepositPage;
import ru.raiffeisen.demo.pages.InsurancePage;

public class InsuranceSteps {

    InsurancePage insurancePage = new InsurancePage();

    @Когда("поле \"(.*)\" заполняется значением \"(.*)\"")
    public void fillField(String name, String value) throws Exception {
        insurancePage.fillField(name, value);
    }

    @Когда("выполнено нажатие на \"(.*)\"")
    public void click(String name) throws Exception {
        insurancePage.click(name);
    }

    @Когда("заполняются поля:")
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