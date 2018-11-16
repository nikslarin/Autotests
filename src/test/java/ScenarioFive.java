
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


        HashMap<String, String> testCheckData = new HashMap<>();
        testCheckData.put("Форма заявки на страховую программу", "Форма заявки на страховую программу");
        testCheckData.put("Вояж (Комфорт/Бизнес класс/Первый класс)", "Вояж (Комфорт/Бизнес класс/Первый класс)");


        mainSteps.acceptRegion();
        mainSteps.selectMenuItem("Страхование");
        insuranceSteps.click("В путешествие");
        insuranceSteps.click("Оставить заявку");
        insuranceChecks.checkField("Форма заявки на страховую программу",  testCheckData.get("Форма заявки на страховую программу"));
        insuranceChecks.checkField("Вояж (Комфорт/Бизнес класс/Первый класс)",  testCheckData.get("Вояж (Комфорт/Бизнес класс/Первый класс)"));
        insuranceSteps.fillField("Фамилия", testData.get("Фамилия"));
        insuranceSteps.fillField("Имя", testData.get("Имя"));
        insuranceSteps.fillField("Отчество", testData.get("Отчество"));
        insuranceSteps.fillField("Дата рождения", testData.get("Дата рождения"));
        insuranceSteps.fillField("Телефон", testData.get("Телефон"));
        insuranceSteps.click("Согласие на обработку персональных данных");
        insuranceSteps.fillField("Проверочный код", testData.get("Код"));
        insuranceChecks.checkIsEnabled("Отправить");

//        //       click(getDriver().findElement((By.xpath("//a[@class='sec-menu__link sm-i region-active']"))));
//        click(getDriver().findElement((By.xpath("//a[contains(text(),'Страхование')]"))));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'В путешествие')]")));
//        click(getDriver().findElement((By.xpath("//a[@href='/retail/insurance/everyday/travel/vbc/']"))));
//        click(getDriver().findElement((By.xpath("//div[@class='b-intro__block-buttons']//a[contains(text(),'Оставить заявку')]"))));
//        Assert.assertEquals("Форма заявки на страховую программу", driver.findElement(By.xpath("//h1[@class='e-title e-title--h2']"))
//                .getText());
//        Assert.assertEquals("Вояж (Комфорт/Бизнес класс/Первый класс)", driver.findElement(By.xpath("//span[@role='combobox']//span[2]"))
//                .getText());
//        getDriver().findElement((By.xpath("//input[@placeholder='Фамилия']"))).clear();
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Фамилия']"))), "Иванов");
//        getDriver().findElement((By.xpath("//input[@placeholder='Имя']"))).clear();
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Имя']"))), "Иван");
//        getDriver().findElement((By.xpath("//input[@placeholder='Отчество']"))).clear();
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Отчество']"))), "Иванович");
//        getDriver().findElement((By.xpath("//input[@placeholder='Дата Рождения']"))).clear();
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Дата Рождения']"))), "05.05.1976");
//        getDriver().findElement((By.xpath("//div[text()='Номер телефона']/preceding-sibling::input"))).clear();
//        fillField(getDriver().findElement((By.xpath("//div[text()='Номер телефона']/preceding-sibling::input"))), "9421234455");
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Электронная почта']"))), "gagaga@mail.ru");
//        click(getDriver().findElement((By.xpath("//input[@data-label='Согласие на обработку персональных данных']/parent::label//span"))));
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Проверочный код']"))), "44422222");
//        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
    }
}

