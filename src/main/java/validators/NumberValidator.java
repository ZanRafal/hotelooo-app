package validators;

public class NumberValidator {

    public static boolean validNumberOfGuests(int value) {
        return value <= 4;
    }

    public static boolean validReservationTime(int value) {
        return value <= 21;
    }

    public static boolean validPhoneNumber(String value) {
        if(value.isEmpty()) return false;
        if(value.length() > 10) return false;

        return value.matches("[1-9]");
    }
}
