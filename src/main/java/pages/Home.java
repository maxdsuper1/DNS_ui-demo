package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;

import static com.codeborne.selenide.Selenide.*;

public class Home {

    private  SelenideElement searchLine= $("[placeholder=\"Поиск среди более 100 000 товаров\"]"),
    registrationButton = $("ul.header-top-menu__profile-list > li:nth-child(4) > a"),
    registrationTitle = $("body > div.page > div.main > div.topic");

    public void url(){
        open("https://www.dns-shop.ru/");
    }

    public void search(String search){
        searchLine.shouldBe(Condition.enabled).setValue(search).submit();
        //searchLine.shouldHave(Condition.text(search)).submit();
    }

    public void clickregistration(){
        searchLine.shouldBe(Condition.visible).click();
        registrationTitle.shouldHave(Condition.text("\n" +
                "    Регистрация"));
        //searchLine.shouldHave(Condition.text(search)).submit();
    }
}
