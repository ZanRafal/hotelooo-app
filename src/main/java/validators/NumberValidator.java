package validators;

public class NumberValidator {

    public static boolean validNumberOfGuests(int value) {
        return value <= 4;
    }

    public static boolean validReservationTime(int value) {
        return value <= 21;
    }


}
