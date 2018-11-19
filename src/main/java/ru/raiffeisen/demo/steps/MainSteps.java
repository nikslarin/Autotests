package ru.raiffeisen.demo.steps;


import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import ru.raiffeisen.demo.pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @Когда("выбран пункт меню \"(.*)\"")
    public void selectMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.mainMenu, itemName);
    }

    @Когда("выбран подпункт меню \"(.*)\"")
    public void selectSubMenuItem(String itemName){
        mainPage.selectMenuItem(mainPage.subMenu, itemName);
    }

    @Когда("подтвержден регион")
    public void acceptRegion() {
        mainPage.click(mainPage.acceptRegion);
    }
}