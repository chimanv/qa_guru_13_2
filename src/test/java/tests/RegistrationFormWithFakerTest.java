package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormWithFakerTest extends BaseTest {

    @Test
    void signOnSite() {
        registrationFormPage.
                openPage().
                setFirstName(dataTest.firstName).
                setUserName(dataTest.userName).
                setEmail(dataTest.email).
                selectGender(dataTest.gender).
                setPhoneNumber(dataTest.phoneNumber).
                setDayOfBirth(dataTest.day, dataTest.month, dataTest.year).
                selectSubject(dataTest.subject).
                selectHobby(dataTest.hobby).
                uploadFile(dataTest.fileName).
                setAddress(dataTest.address).
                selectState(dataTest.state).
                selectCity(dataTest.city).
                pressSubmit().
                chekResult("Student Name", dataTest.firstName + " " + dataTest.userName).
                chekResult("Student Email", dataTest.email).
                chekResult("Gender", dataTest.gender).
                chekResult("Mobile", dataTest.phoneNumber).
                chekResult("Date of Birth", dataTest.day + " " + dataTest.month + "," + dataTest.year).
                chekResult("Subjects", dataTest.subject).
                chekResult("Hobbies", dataTest.hobby).
                chekResult("Picture", dataTest.fileName).
                chekResult("Address", dataTest.address).
                chekResult("State and City", dataTest.state + " " + dataTest.city);

    }
}
