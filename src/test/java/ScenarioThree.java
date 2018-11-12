import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class ScenarioThree extends BaseTest {

    @Test
    public void scenarioThree() {

        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/#/favourites");

        click(getDriver().findElement((By.xpath("//icon-close[@class='one-click-popup__close icon']"))));
        click(getDriver().findElement((By.xpath("//a[@class='actions-menu__item actions-menu__item_transfer']"))));
        click(getDriver().findElement((By.xpath("//div[@class='extension-menu__name' and contains(text(),'Клиенту банка')]"))));
        selectInput(getDriver().findElement((By.xpath("//c-select-item[@class='c-select-item_selected c-select-item']"))), "Мой счет в рублях");
        click(getDriver().findElement((By.xpath("//label[contains(text(),'По номеру телефона')]"))));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        fillField(getDriver().findElement((By.xpath("//input[@class='c-input-phone__input c-input ng-untouched ng-pristine ng-invalid']"))), "79264445588");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        Assert.assertEquals("Сидоров П.И.", driver.findElement(By.xpath("//div[@class='rc-row__static-value']"))
                .getText());
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        fillField(getDriver().findElement((By.xpath("//div[@class='rc-row-double-value__first']//c-input-currency//input[@placeholder='Сумма']"))), "0");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        Assert.assertEquals("Сумма перевода должна быть больше 0", driver.findElement(By.xpath("//span[@class='simple-error']"))
                .getText());
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        fillField(getDriver().findElement((By.xpath("//div[@class='rc-row-double-value__first']//c-input-currency//input[@placeholder='Сумма']"))), "12000000000");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Assert.assertEquals("Введенная сумма превышает максимально допустимую (1 000 000,00 \u20BD)", driver.findElement(By.xpath("//span[@class='simple-error']"))
                .getText());
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        fillField(getDriver().findElement((By.xpath("//div[@class='rc-row-double-value__first']//c-input-currency//input[@placeholder='Сумма']"))), "100");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        Assert.assertEquals("0,00 \u20BD", driver.findElement(By.xpath("//amount[@class='c-amount c-amount_inline ng-star-inserted']"))
                .getText());
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        fillField(getDriver().findElement((By.xpath("//label[text()='Сообщение получателю']/parent::div/following-sibling::div[@class='rc-row__value']//textarea"))), "test");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        click(getDriver().findElement((By.xpath("//button[@class='rc-form__submit rc-button']"))));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        Assert.assertEquals("40817810000000001236", driver.findElement(By.xpath("//div[text()='Списать со счета:']/following-sibling::div"))
                .getText());
        Assert.assertEquals("79264445588", driver.findElement(By.xpath("//div[text()='По номеру телефона:']/following-sibling::div"))
                .getText());
        Assert.assertEquals("Сидоров Петр Иванович", driver.findElement(By.xpath("//div[text()='ФИО получателя:']/following-sibling::div"))
                .getText());
        Assert.assertEquals("100,00 \u20BD", driver.findElement(By.xpath("//div[text()='Сумма перевода:']/following-sibling::div"))
                .getText());
        Assert.assertEquals("Комиссия не взимается", driver.findElement(By.xpath("//div[text()='Комиссия']/following-sibling::div"))
                .getText());

    }
}
