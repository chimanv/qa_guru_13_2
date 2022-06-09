package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormTest extends BaseTest {

    @Test
    void signOnSite() {

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

        registrationFormPage.
                openPage().
                setFirstName(firstName).
                setUserName(userName).
                setEmail(email).
                selectGender(gender).
                setPhoneNumber(phoneNumber).
                setDayOfBirth(dayBrthd, monthBthd, yearBrthd).
                selectSubject(subject).
                selectHobby(hobby).
                uploadFile(fileName).
                setAddress(address).
                selectState(state).
                selectCity(city).
                pressSubmit();

        registrationFormPage.
                chekResult("Student Name", firstName + " " + userName).
                chekResult("Student Email", email).
                chekResult("Gender", gender).
                chekResult("Mobile", phoneNumber).
                chekResult("Date of Birth", dayBrthd + " " + monthBthd + "," + yearBrthd).
                chekResult("Subjects", subject).
                chekResult("Hobbies", hobby).
                chekResult("Picture", fileName).
                chekResult("Address", address).
                chekResult("State and City", state + " " + city);

    }
}
