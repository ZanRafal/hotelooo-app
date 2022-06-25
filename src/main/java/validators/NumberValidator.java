package validators;

import java.util.regex.Pattern;

public class NumberValidator {

    public static boolean validNumberOfGuests(int value) {
        if(value == 0) return false;
        return value <= 4;
    }

    public static boolean validReservationTime(int value) {
        if(value == 0) return false;
        return value <= 21;
    }

    public static boolean validPhoneNumber(String value) {
        if(value.isEmpty()) return false;
        Pattern pattern = Pattern.compile("^\\d{10}$");

        return pattern.matcher(value).matches();
    }
}
