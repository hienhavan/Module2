package bai9.tinhngaytieptheo;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("1-1-2018")
    public void testNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        NextDayCalculator calculator = new NextDayCalculator(day, month, year);
        String comparativeValue = "2-1-2018";
        assertEquals(calculator.nextDay(month, day), comparativeValue);
    }

    @Test
    @DisplayName("31-1-2018")
    public void testNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        NextDayCalculator calculator = new NextDayCalculator(day, month, year);
        String comparativeValue = "1-2-2018";
        assertEquals(calculator.nextDay(month, day), comparativeValue);
    }

    @Test
    @DisplayName("30-4-2018")
    public void testNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        NextDayCalculator calculator = new NextDayCalculator(day, month, year);
        String comparativeValue = "1-5-2018";
        assertEquals(calculator.nextDay(month, day), comparativeValue);
    }

    @Test
    @DisplayName("28-2-2018")
    public void testNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        NextDayCalculator calculator = new NextDayCalculator(day, month, year);
        String comparativeValue = "1-3-2018";
        assertEquals(calculator.nextDay(month, day), comparativeValue);
    }
    @Test
    @DisplayName("29-2-2018")
    public void testNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        NextDayCalculator calculator = new NextDayCalculator(day, month, year);
        String comparativeValue = "1-3-2020";
        assertEquals(calculator.nextDay(month, day), comparativeValue);
    }
    @Test
    @DisplayName("31-12-2018")
    public void testNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        NextDayCalculator calculator = new NextDayCalculator(day, month, year);
        String comparativeValue = "1-1-2019";
        assertEquals(calculator.nextDay(month, day), comparativeValue);
    }
}