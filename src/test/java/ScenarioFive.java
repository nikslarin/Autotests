import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class ScenarioFive extends BaseTest{
    @Test
    public void scenarioFive() {

        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
 //       click(getDriver().findElement((By.xpath("//a[@class='sec-menu__link sm-i region-active']"))));
        click(getDriver().findElement((By.xpath("//a[contains(text(),'Страхование')]"))));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'В путешествие')]")));
        click(getDriver().findElement((By.xpath("//a[@href='/retail/insurance/everyday/travel/vbc/']"))));
        click(getDriver().findElement((By.xpath("//div[@class='b-intro__block-buttons']//a[contains(text(),'Оставить заявку')]"))));
        Assert.assertEquals("Форма заявки на страховую программу", driver.findElement(By.xpath("//h1[@class='e-title e-title--h2']"))
                .getText());
        Assert.assertEquals("Вояж (Комфорт/Бизнес класс/Первый класс)", driver.findElement(By.xpath("//span[@role='combobox']//span[2]"))
                .getText());
        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Фамилия']"))), "Иванов");
        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Имя']"))), "Иван");
        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Отчество']"))), "Иванович");
        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Дата Рождения']"))), "05.05.1976");
        fillField(getDriver().findElement((By.xpath("//div[text()='Номер телефона']/preceding-sibling::input"))), "9421234455");
        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Электронная почта']"))), "gagaga@mail.ru");
        click(getDriver().findElement((By.xpath("//input[@data-label='Согласие на обработку персональных данных']/parent::label//span"))));
        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Проверочный код']"))), "44422222");
        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
    }

}
