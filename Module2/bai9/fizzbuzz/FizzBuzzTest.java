package bai9.fizzbuzz;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    @DisplayName("chia het cho 3")
    public void divideBy3() {
        int numberDivideBy3 = 9;
        String expected = "Fizz";
        String actual = FizzBuzz.render(numberDivideBy3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("chia het cho 5")
    public void divideBy5() {
        int numberDivideBy3 = 10;
        String expected = "Buzz";
        String actual = FizzBuzz.render(numberDivideBy3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("chia het cho 3 và 5")
    public void divideBy3and5() {
        int numberDivideBy3 = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.render(numberDivideBy3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("có chứa số 3")
    public void containsTheNumber3() {
        int numberDivideBy3 = 13;
        String expected = "Fizz";
        String actual = FizzBuzz.render(numberDivideBy3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("có chứa số 5")
    public void containsTheNumber5() {
        int numberDivideBy3 = 52;
        String expected = "Buzz";
        String actual = FizzBuzz.render(numberDivideBy3);
        assertEquals(expected, actual);
    }
}