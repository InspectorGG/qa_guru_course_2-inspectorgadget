package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.PressTab;
import javafx.scene.control.Tab;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

class GoogleTest {
    @Test
    void selenideSearchTest() {

        open("https://google.com");


        $(byName("q")).setValue("qa.guru").pressEnter();

        $("html").shouldHave(text("QA.GURU"));

        open("https://qa.guru/");

        $(byName("formParams[email]")).setValue("test@test.com");

        $(byName("formParams[full_name]")).setValue("Daniil");

        $(byName("formParams[phone]")).setValue("+79992221122").pressEnter();
        

    }
}
