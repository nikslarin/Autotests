package ru.raiffeisen.demo.steps;

import cucumber.api.java.en.When;
import ru.raiffeisen.demo.pages.MainPage;

public class MainSteps {


    MainPage mainPage = new MainPage();


    @When("выбран пункт верхнего меню \"(.*)\"")
    public void selectSubMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.topMenu, itemName);
    }


    @When("^закрыто всплывающее окно$")
    public void closeBunner() {
        mainPage.click(mainPage.acceptRegion);
    }
}