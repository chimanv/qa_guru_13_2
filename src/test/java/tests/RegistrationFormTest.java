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

        String firstName = "Ivanov";
        String userName = "Ivan";
        String email = "test@test.tt";
        String gender = "Male";
        String phoneNumber = "7111222333";
        String yearBrthd = "2000";
        String dayBrthd = "10";
        String monthBthd = "July";
        String subject = "Computer science";
        String hobby = "Music";
        String fileName = "Screenshot_2.png";
        String address = "Sovetskaya st. 1";
        String state = "Haryana";
        String city = "Karnal";

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
        $("#currentAddress").setValue(address);

        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();

        $("#submit").click();

        $(".modal-content").shouldHave(
                text(firstName + " " + userName),
                text(email),
                text(gender),
                text(phoneNumber),
                text(dayBrthd + " " + monthBthd + "," + yearBrthd),
                text(subject),
                text(hobby),
                text(fileName),
                text(address),
                text(state + " " + city));
    }
}
