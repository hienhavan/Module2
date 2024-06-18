package bai9.fizzbuzz;

public class FizzBuzz {
    public static String render(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (String.valueOf(number).contains("3")) {
            return "Fizz";
        } else if (String.valueOf(number).contains("5")) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
