import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Elit1   extends ChromeRunner {
    @Test
    public void project1() {
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("Yana").shouldBe(Condition.visible);
        $(byId("lastName")).setValue("Makhachyan").shouldBe(Condition.visible);
        $(byId("email")).setValue("makhachyan@mail.ru").shouldBe(Condition.appear);
        $(byId("password")).setValue("123456").shouldBe(Condition.appear);
        $(byId("confirmPassword")).setValue("123456").shouldBe(Condition.appear);
        $(byId("singup")).shouldBe(Condition.enabled);
        sleep(5000);


    }

}
