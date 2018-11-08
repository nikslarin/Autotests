import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class ScenarionOneTest extends BaseTest {
    @Test
    public void scenarioOne() {

        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");

        click(getDriver().findElement((By.xpath("//ul[@class='main-menu']//a[@href='/retail/remote_service/connect/']"))));
        click(getDriver().findElement((By.xpath("//a[@class='menu-link main-menu__link' and contains(text(),'Документы без очереди')]/preceding-sibling::a[@class='menu-link main-menu__link' and contains(text(),'Переводы по карте/телефону')]"))));

        Assert.assertEquals("Перевод с карты на карту / по номеру телефона", driver.findElement(By.xpath("//h1[@class='e-title e-title--h2']"))
                .getText());


        getDriver().findElement((By.xpath("//input[@placeholder='Номер карты отправителя']")))
                .sendKeys("5406 5715 1819 4617");
        getDriver().findElement((By.xpath("//input[@placeholder='Номер карты получателя']")))
                .sendKeys("5367433138590699");
        getDriver().findElement((By.xpath("//input[@placeholder='CVC2']")))
                .sendKeys("512");
        getDriver().findElement((By.xpath("//input[@placeholder='Сумма перевода, \u20BD']")))
                .sendKeys("5");

        Assert.assertEquals("Минимальная сумма перевода – 10 р.", driver.findElement(By.xpath("//div[text()='На карту любого банка']/ancestor::div[@class='c2c__card__title']/ancestor::div[@class='c2c__from float-left']//div[@class='c2c__error']"))
                .getText());

    }

    private void acceptRegion() {
        click(getDriver().findElement((By.xpath("//*[text()='Да']"))));
    }
}