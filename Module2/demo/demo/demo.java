package demo.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class demo {
    private LocalDate datein;
    private LocalDate dateout;
    public  int date(){
        long numdays = DAYS.between(datein,dateout);
        return (int) numdays;
    }
    public static void main(String[] args) {
        int number = 35;
        String message = "123";
        String stack = "s * (s – a) * (s – b) * (s – c)";
        boolean numbers = (String.valueOf(number).contains("3"));
        System.out.println(numbers);
        String numverss = Integer.toString(number);
        int messages = Integer.parseInt(message);
        System.out.println(messages);
        System.out.println(numverss);
        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
         String[] stacks = stack.split(" ");
        System.out.println(Arrays.toString(stacks));
    }
}
