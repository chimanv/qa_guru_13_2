package utils;

import tests.StateAndCity;

import java.text.SimpleDateFormat;
import java.util.*;

public class RandomUtils {

    public String getGender() {
        List<String> genderList = Arrays.asList("Male", "Female", "Other");
        Random rand = new Random();
        return genderList.get(rand.nextInt(genderList.size()));
    }

    public String getHobby() {
        List<String> hobbiesList = Arrays.asList("Sports", "Reading", "Music");
        Random rand = new Random();
        return hobbiesList.get(rand.nextInt(hobbiesList.size()));
    }

    public String getParseYear(Date date) {
        String[] dateParts = parseDateForCheck(date).split("-");
        return dateParts[2];
    }

    public String getParseMonth(Date date) {
        String[] dateParts = parseDateForCheck(date).split("-");
        return dateParts[1];
    }

    public String getParseDay(Date date) {
        String[] dateParts = parseDateForCheck(date).split("-");
        return dateParts[0];
    }

    public String getSubject() {
        List<String> stateList = Arrays.asList("Computer science", "Maths", "Chemistry", "Economics");
        Random rand = new Random();
        return stateList.get(rand.nextInt(stateList.size()));
    }

    public String getState() {
        List<String> stateList = Arrays.asList("NCR", "Haryana", "Rajasthan", "Uttar Pradesh");
        Random rand = new Random();
        return stateList.get(rand.nextInt(stateList.size()));
    }

    public String getCity(String state) {
        List<String> cityList = StateAndCity.STATE_AND_CITY.get(state);
        Random rand = new Random();
        return cityList.get(rand.nextInt(cityList.size()));
    }

    private String parseDateForCheck(Date date) {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MMMM-yyyy");
        return dt.format(date);
    }
}
