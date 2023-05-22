import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Elit2  extends ChromeRunner {
    @Test
    public void project2 ()    {

        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.appear);
        sleep(3000);
        $(byId("lastName")).click();
        $(byId("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        sleep(3000);
        $(byId("email")).setValue("1234");
        $(byId("password")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        sleep(3000);
        $(byId("password")).click();
        $(byId("confirmPassword")).setValue("222").click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);




    }






}
