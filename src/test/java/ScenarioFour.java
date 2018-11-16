//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.HashMap;
//import java.util.concurrent.TimeUnit;
//
//
//public class ScenarioFour extends BaseTest {
//    @Test
//    public void scenarioFour() {
//        WebDriver driver = getDriver();
//        driver.get("https://online.raiffeisen.ru/demo/#/favourites");
//
//        click(getDriver().findElement((By.xpath("//icon-close[@class='one-click-popup__close icon']"))));
//        click(getDriver().findElement((By.xpath("//span[text()='Шаблоны и автоплатежи']"))));
//        selectInput(getDriver().findElement((By.xpath("//span[text()='Выберите операцию']"))), "Мобильная связь");
//        click(getDriver().findElement((By.xpath("//button[text()='Создать']"))));
//        fillField(getDriver().findElement((By.xpath("//input[@class='c-input-phone__input c-input ng-untouched ng-pristine ng-invalid']"))), "79264445588");
//        selectInput2(getDriver().findElement((By.xpath("//label[text()='Оплатить с карты']/parent::div/following-sibling::div//c-select"))), "2");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Сумма']")));
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Сумма']"))), "29,99");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='simple-error']")));
//        Assert.assertEquals("Введенная сумма меньше минимальной разрешенной (30,00 \u20BD)", driver.findElement(By.xpath("//span[@class='simple-error']"))
//                .getText());
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Сумма']")));
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Сумма']"))), "15000");
//        Assert.assertEquals("Введенная сумма превышает максимально допустимую (14 999,99 \u20BD)", driver.findElement(By.xpath("//span[@class='simple-error']"))
//                .getText());
//        fillField(getDriver().findElement((By.xpath("//input[@placeholder='Сумма']"))), "150");
//        click(getDriver().findElement((By.xpath("//label[text()='Создать шаблон']"))));
//        fillField(getDriver().findElement((By.xpath("//label[text()='Название шаблона']/parent::div/following-sibling::div//input"))), "test");
//        click(getDriver().findElement((By.xpath("//label[text()='Добавить шаблон в избранное']/preceding-sibling::label//div"))));
//        click(getDriver().findElement((By.xpath("//button[@type='button']//span[text()='Сохранить шаблон']"))));
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        Assert.assertEquals("Шаблон сохранен", driver.findElement(By.xpath("//div[@class='notify__header']"))
//                .getText());
//    }
//
//
//}
