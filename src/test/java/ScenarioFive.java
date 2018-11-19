
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;
import ru.raiffeisen.demo.checks.InsuranceChecks;
import ru.raiffeisen.demo.steps.BaseSteps;
import ru.raiffeisen.demo.steps.InsuranceSteps;
import ru.raiffeisen.demo.steps.MainSteps;
import ru.raiffeisen.demo.utils.DriverManager;

import java.util.HashMap;

public class ScenarioFive extends BaseSteps {

    MainSteps mainSteps = new MainSteps();
    InsuranceSteps insuranceSteps = new InsuranceSteps();
    InsuranceChecks insuranceChecks = new InsuranceChecks();


    @Test
    public void scenarioFive() throws Exception {

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия", "Иванов");
        testData.put("Имя", "Иван");
        testData.put("Отчество", "Иванович");
        testData.put("Дата рождения", "12121992");
        testData.put("Телефон", "9101234567");
        testData.put("Код", "44422222");
        testData.put("Электронная почта", "test@test.ru");


        HashMap<String, String> testCheckData = new HashMap<>();
        testCheckData.put("Форма заявки на страховую программу", "Форма заявки на страховую программу");
        testCheckData.put("Вояж (Комфорт/Бизнес класс/Первый класс)", "Вояж (Комфорт/Бизнес класс/Первый класс)");


        mainSteps.acceptRegion();
        mainSteps.selectMenuItem("Страхование");
        insuranceSteps.click("В путешествие");
        insuranceSteps.click("Оставить заявку");
        insuranceChecks.checkFieldByText("Форма заявки на страховую программу",  testCheckData.get("Форма заявки на страховую программу"));
        insuranceChecks.checkFieldByText("Вояж (Комфорт/Бизнес класс/Первый класс)",  testCheckData.get("Вояж (Комфорт/Бизнес класс/Первый класс)"));
        insuranceSteps.fillField("Фамилия", testData.get("Фамилия"));
        insuranceSteps.fillField("Имя", testData.get("Имя"));
        insuranceSteps.fillField("Отчество", testData.get("Отчество"));
        insuranceSteps.fillField("Дата рождения", testData.get("Дата рождения"));
        insuranceSteps.fillField("Телефон", testData.get("Телефон"));
        insuranceSteps.fillField("Электронная почта", testData.get("Электронная почта"));
        insuranceSteps.click("Согласие на обработку персональных данных");
        insuranceSteps.fillField("Проверочный код", testData.get("Код"));
        insuranceChecks.checkIsEnabled("Отправить");

    }
}

