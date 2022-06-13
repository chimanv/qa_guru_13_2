package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationFormPage;

public class BaseTest {
    final RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    final DataTest dataTest = new DataTest();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1200";
    }
}
