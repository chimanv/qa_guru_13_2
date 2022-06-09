package pages;

import pages.components.CalendarComponent;
import pages.components.TableOfResultsComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {
    private final CalendarComponent calendarComponent = new CalendarComponent();
    private final TableOfResultsComponent tableOfResultsComponent = new TableOfResultsComponent();
    private final static String TITLE_REGISTRATION_FORM = "Student Registration Form";

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_REGISTRATION_FORM));
        removeFooterAndFixeban();
        return this;
    }

    public RegistrationFormPage setFirstName(String firstName) {
        $("#firstName").setValue(firstName);
        return this;
    }

    public RegistrationFormPage setUserName(String userName) {
        $("#lastName").setValue(userName);
        return this;
    }

    public RegistrationFormPage setEmail(String email) {
        $("#userEmail").setValue(email);
        return this;
    }

    public RegistrationFormPage selectGender(String gender) {
        $(byText(gender)).click();
        return this;
    }

    public RegistrationFormPage setPhoneNumber(String phoneNumber) {
        $("#userNumber").setValue(phoneNumber);
        return this;
    }

    public RegistrationFormPage selectSubject(String subject) {
        $("#subjectsInput").sendKeys(subject);
        $("#subjectsInput").pressEnter();
        return this;
    }

    public RegistrationFormPage selectHobby(String hobby) {
        $(byText(hobby)).click();
        return this;
    }

    public RegistrationFormPage uploadFile(String fileName) {
        $("#uploadPicture").uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationFormPage setAddress(String address) {
        $("#currentAddress").setValue(address);
        return this;
    }

    public RegistrationFormPage setDayOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.selectDate(day, month, year);
        return this;
    }

    public RegistrationFormPage selectState(String state) {
        $("#state").click();
        $(byText(state)).click();
        return this;
    }

    public RegistrationFormPage selectCity(String city) {
        $("#city").click();
        $(byText(city)).click();
        return this;
    }

    public RegistrationFormPage pressSubmit() {
        $("#submit").click();
        return this;
    }

    public RegistrationFormPage chekResult(String key, String value) {
        tableOfResultsComponent.checkData(key, value);
        return this;
    }

    private void removeFooterAndFixeban() {
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }
}
