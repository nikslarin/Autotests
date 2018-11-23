package demo_new.steps;

import cucumber.api.java.en.When;
import demo_new.pages.MainPage;

public class MainSteps {


    MainPage mainPage = new MainPage();

    @When("выбран пункт меню \"(.*)\"")
    public void selectMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.mainMenu, itemName);
    }

    @When("выбран пункт верхнего меню \"(.*)\"")
    public void selectSubMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.topMenu, itemName);
    }


    @When("^закрыто всплывающее окно$")
    public void closeBunner() {
        mainPage.click(mainPage.closeBtn);
    }
}