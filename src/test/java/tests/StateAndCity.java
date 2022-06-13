package tests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateAndCity {
    public static Map<String, List<String>> STATE_AND_CITY = new HashMap<>();

    static {
        STATE_AND_CITY.put("NCR", List.of("Delhi", "Gurgaon", "Noida"));
        STATE_AND_CITY.put("Uttar Pradesh", List.of("Agra", "Lucknow", "Merrut"));
        STATE_AND_CITY.put("Haryana", List.of("Karnal", "Panipat"));
        STATE_AND_CITY.put("Rajasthan", List.of("Jaipur", "Jaiselmer"));
    }
}
