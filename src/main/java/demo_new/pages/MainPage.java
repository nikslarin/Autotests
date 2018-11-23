package demo_new.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class MainPage extends BasePage{

    @FindBy(xpath = "//a[contains(@class,'actions-menu__item actions-menu')]")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "//a[contains(@class,'top-sidebar__navigation-item')]")
    public List<WebElement> topMenu;

    @FindBy(xpath = "//icon-close")
    public WebElement closeBtn;


    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "demo_new.pages.MainPage");
    }
}