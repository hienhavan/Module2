package demo.demo;

import java.time.LocalDate;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        int number = 35;
        String message = "123";
        boolean numbers = (String.valueOf(number).contains("3"));
        System.out.println(numbers);
        String numverss = Integer.toString(number);
        int messages = Integer.parseInt(message);
        System.out.println(messages);
        System.out.println(numverss);
        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
    }
}
