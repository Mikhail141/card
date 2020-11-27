package ru.netology.card;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardTest {


    @BeforeEach
    void setUp(){
        open("http://localhost:9999");
    }

    @Test
    void shouldRequest(){
       $("[data-test-id=name] input").setValue("Петров Иван");
       $("[data-test-id=phone] input").setValue("+79999999999");
       $("[data-test-id=agreement]").click();
       $("button").click();
       $("[data-test-id=order-success]").shouldHave(exactText(" Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));



}
}

