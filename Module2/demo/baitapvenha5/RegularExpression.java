package demo.baitapvenha5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String CHECK_THE_DATE = "^([0-2][\\d]|3[0-1])\\/(0[\\d]|1[0-2])\\/2[\\d]{3}$";
    private static final String CHECK_THE_DATE_AND_TIME = "^(([0-1][\\d]|2[0-3]):([0-5][\\d]|6[0]))|00:00$";
    private static final String CHECK_YOUR_CREDIT_CARD_NUMBER = "^[\\d]{4}(-| )[\\d]{4}(-| )[\\d]{4}$";

    public static void main(String[] args) {
        /**
         Kiểm tra định dạng ngày tháng: dd/mm/yyyy
         b1: 2 chu so(chu so dau tu 0-2 thi chu so sau tu 0-9,
         chu so dau la 3 thi chu so sau tu 0-1 ---> [0-2][\d]|3[0-1]
         b2: dau /                         --> \\/
         b3: 2 chu so (chu so dau la 0 thi chu so sau tu (0[\d]
         chu so dau la 1 thi chu so sau tu 0-2 ---> |1[0-2])
         b4: dau /                         --> \\/
         b5: năm bat dau tu so 2 va 3 so phia sau                 --> 2[\d]{3}
         ==> Regex : ^([0-2][\d]|3[0-1])\/(0[\d]|1[0-2])\/2[\d]{3}$
         */
        regularExpression(CHECK_THE_DATE, "02/12/2012");
        /**
         Kiểm tra giờ hợp lệ: HH:MM (HH - giờ, MM phút)
         b1 : 2 chu so( chu so dau la 0 hoac 1 thi chu so sau tu 0 -9;
         chu so dau la 2 thi chu so sau tu 0-3 ---> ([0|1][\d]|2[0-3])
         b2: dau :                              ---> \:
         b3: 2 chu so( chu so dau tu 0-5, chu so sau tu 0-9)--->[0-5][\d]|6[0]))|24:00
         ===> Regex : ^(([0|1][\d]|2[0-3]):([0-5][\d]|6[0]))|24:00$
         */
        regularExpression(CHECK_THE_DATE_AND_TIME, "23:00");
        /**
         Kiểm tra số thẻ tín dụng: Một số thẻ tín dụng thường có 16 chữ số, có thể được nhóm thành 4 nhóm cách nhau bởi dấu gạch ngang (-) hoặc khoảng trắng.
         b1 : 4 chu so tu 0-9  ---> [0-9]{4}
         b2 :dau - hoac khoang trang ---> [-| ]
         b3 : 4 chu so tu 0-9  ---> [0-9]{4}
         b4 :dau - hoac khoang trang ---> [-| ]
         b5 : 4 chu so tu 0-9  ---> [0-9]{4}
         b6 :dau - hoac khoang trang ---> [-| ]
         b7 : 4 chu so tu 0-9  ---> [0-9]{4}
         ===> Regex: ^[\d]{4}(-| )[\d]{4}(-| )[\d]{4}$
         */
        regularExpression(CHECK_YOUR_CREDIT_CARD_NUMBER, "1231-1234-4213");
    }

    private static void regularExpression(String check, String input) {
        Pattern pattern = Pattern.compile(check);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
        System.out.println(matcher);
    }
}

