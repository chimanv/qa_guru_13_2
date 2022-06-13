package tests;

import com.github.javafaker.Faker;
import utils.RandomUtils;

import java.util.Date;
import java.util.Random;

public class DataTest {
    Faker faker = new Faker();
    Random random = new Random();
    RandomUtils randomUtils = new RandomUtils();

    Date randomDateOfBirth = faker.date().birthday();

    String firstName = faker.address().firstName(),
            userName = faker.address().lastName(),
            email = faker.internet().emailAddress(),
            gender = randomUtils.getGender(),
            phoneNumber = String.valueOf(random.nextInt(1000000000) + 9000000000L),
            day = randomUtils.getParseDay(randomDateOfBirth),
            month = randomUtils.getParseMonth(randomDateOfBirth),
            year = randomUtils.getParseYear(randomDateOfBirth),
            subject = randomUtils.getSubject(),
            hobby = randomUtils.getHobby(),
            fileName = "Screenshot_2.png",
            address = faker.address().fullAddress(),
            state = randomUtils.getState(),
            city = randomUtils.getCity(state);
}
