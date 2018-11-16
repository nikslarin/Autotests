import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.raiffeisen.demo.pages.MainPage;
import ru.raiffeisen.demo.pages.ServicePage;
import ru.raiffeisen.demo.pages.TransferPage;
import ru.raiffeisen.demo.steps.BaseSteps;

import java.util.HashMap;

public class ScenarionOneTest extends BaseSteps {
    @Test
    public void scenarioOne() {
        MainPage mainPage = new MainPage();
        ServicePage servicePage = new ServicePage();
        TransferPage transferPage = new TransferPage();

//        mainPage.selectMenuItem("Сервисы");
//        servicePage.selectMenuItem("Переводы по карте/телефону");

//        Assert.assertEquals("Перевод с карты на карту / по номеру телефона", driver.findElement(By.xpath("//h1[@class='e-title e-title--h2']"))
//                .getText());
//        getDriver().findElement((By.xpath("//input[@placeholder='Номер карты отправителя']")))
//                .sendKeys("5406 5715 1819 4617");
//        getDriver().findElement((By.xpath("//input[@placeholder='Номер карты получателя']")))
//                .sendKeys("5367433138590699");
//        getDriver().findElement((By.xpath("//input[@placeholder='CVC2']")))
//                .sendKeys("512");
//        getDriver().findElement((By.xpath("//input[@placeholder='Сумма перевода, \u20BD']")))
//                .sendKeys("5");
//        Assert.assertEquals("Минимальная сумма перевода – 10 р.", driver.findElement(By.xpath("//div[text()='На карту любого банка']/ancestor::div[@class='c2c__card__title']/ancestor::div[@class='c2c__from float-left']//div[@class='c2c__error']"))
//                .getText());

    }
//    private void acceptRegion() {
//        click(getDriver().findElement((By.xpath("//*[text()='Да']"))));
//    }
}