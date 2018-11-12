import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
public class ScenarioTwoTest extends BaseTest {
    @Test
    public void scenarioTwo() {

        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        click(getDriver().findElement((By.xpath("//a[@class='sec-menu__link sm-i region-active']"))));
        click(getDriver().findElement((By.xpath("//a[@class='region-list__city' and contains(text(),'Владимир')]"))));
        Assert.assertEquals("ВЛАДИМИР", driver.findElement(By.xpath("//a[@class='sec-menu__link sm-i region-active']"))
                .getText());

        scroll(getDriver().findElement((By.xpath("//li//a[contains(text(),'Качество обслуживания')]"))));
        Assert.assertEquals("Реквизиты", driver.findElement(By.xpath("//a[@href='/about/requisites/']"))
                .getText());
        Assert.assertEquals("Карьера в банке", driver.findElement(By.xpath("//a[@href='https://career.raiffeisen.ru/']"))
                .getText());
        Assert.assertEquals("Качество обслуживания", driver.findElement(By.xpath("//a[@href='/retail/servicequality/']"))
                .getText());
        Assert.assertEquals("Противодействие коррупции", driver.findElement(By.xpath("//a[@href='/about/anticorr/']"))
                .getText());
    }

}
