package validators;

public class StringValidator {

    public static boolean validEmail(String value) {
        if(value.isEmpty()) return false;
        String regexPattern = "^(.+)@(\\S+)$";
        return value.matches(regexPattern);
    }
}
