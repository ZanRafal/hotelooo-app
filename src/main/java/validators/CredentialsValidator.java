package validators;

public class CredentialsValidator {

    public static boolean validCredentials(String value) {
        if(!value.trim().contains(" ")) return false;
        if(value.isEmpty()) return false;
        if(value.matches("[1-9]]")) return false;

        return true;
    }
}
