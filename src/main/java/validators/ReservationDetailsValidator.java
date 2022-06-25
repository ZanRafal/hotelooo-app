package validators;


public class ReservationDetailsValidator {

    public static boolean validReservationDetails(
            String credentials,
            String phoneNumber,
            String email,
            String numberOfPeople,
            String numberOfDays) {
        if(!NumberValidator.validNumberOfGuests(Integer.parseInt(numberOfPeople))) return false;
        if(!NumberValidator.validPhoneNumber(phoneNumber)) return false;
        if(!NumberValidator.validReservationTime(Integer.parseInt(numberOfDays))) return false;
        if(!StringValidator.validEmail(email)) return false;
        if(!CredentialsValidator.validCredentials(credentials)) return false;
        return true;
    }
}
