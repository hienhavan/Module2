package demo.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String CHECK_THE_DATE = "^([0-2][\\d]|3[0-1])\\/(0[\\d]|1[0-2])\\/2[\\d]{3}$";
    private static final String CHECK_THE_DATE_AND_TIME = "^(([0|1][\\d]|2[0-3]):([0-5][\\d]|6[0]))|24:00$";
    private static final String CHECK_YOUR_CREDIT_CARD_NUMBER = "^[\\d]{4}(-| )[\\d]{4}(-| )[\\d]{4}$";

    public static void main(String[] args) {
        // Check the date
        regularExpression(CHECK_THE_DATE, "31/12/2012");
        // check the date and time
        regularExpression(CHECK_THE_DATE_AND_TIME, "23:45");
        // check your credit card number
        regularExpression(CHECK_YOUR_CREDIT_CARD_NUMBER, "1231-1234-4213");
    }

    private static void regularExpression(String check, String input) {
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
