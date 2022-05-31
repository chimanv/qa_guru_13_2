package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920*1080";
    }

    @Test
    void signOnSite() {
        open("/automation-practice-form");

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        final String firstName = "Ivanov";
        final String userName = "Ivan";
        final String email = "test@test.tt";
        final String gender = "Male";
        final String phoneNumber = "7111222333";
        final String yearBrthd = "2000";
        final String dayBrthd = "10";
        final String monthBthd = "July";
        final String subject = "Computer science";
        final String hobby = "Music";
        final String fileName = "Screenshot_2.png";

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(userName);
        $("#userEmail").setValue(email);
        $(byText(gender)).click();
        $("#userNumber").setValue(phoneNumber);

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(monthBthd);
        $(".react-datepicker__year-select").selectOption(yearBrthd);
        $(byText(dayBrthd)).click();

        $("#subjectsInput").sendKeys(subject);
        $("#subjectsInput").pressEnter();
        $(byText(hobby)).click();
        $("#uploadPicture").uploadFromClasspath(fileName);
        $("#submit").click();

        $(".modal-content").shouldHave(
                text(firstName + " " + userName),
                text(email),
                text(gender),
                text(phoneNumber),
                text(dayBrthd + " " + monthBthd + "," + yearBrthd),
                text(subject),
                text(hobby),
                text(fileName));
    }
}
