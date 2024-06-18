package bai9.tinhngaytieptheo;

public class NextDayCalculator implements Month {
    int day;
    int year;
    int month;

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String dash = "-";
    int dayOne = 1;
    int day31 = 31;
    int day30 = 30;
    int day28 = 28;
    int day29 = 29;

    public String nextDay(int month, int day) {
        switch (month) {
            case january:
                if (day == dayOne) {
                    day++;
                    return day + dash + month + dash + year;
                }
                String day1 = checkDay31(month, day);
                if (day1 != null) return day1;
                break;
            case march:
            case may:
            case july:
            case august:
            case october:
                String day2 = checkDay31(month, day);
                if (day2 != null) return day2;
                break;
            case december:
                if (day == day31) {
                    day = dayOne;
                    month = january;
                    year++;
                    return day + dash + month + dash + year;
                }
            case april:
            case june:
            case september:
            case november:
                String day3 = checkDay30(month, day);
                if (day3 != null) return day3;
                break;
            case february:
                String day4 = checkDay28And29(month, day);
                if (day4 != null) return day4;
                break;
        }

        return "-1";
    }

    private String checkDay28And29(int month, int day) {

        if (day == day28 || day == day29) {
            day = dayOne;
            month++;
            return day + dash + month + dash + year;
        }
        return null;
    }

    private String checkDay30(int month, int day) {
        if (day == day30) {
            day = dayOne;
            month++;
            return day + dash + month + dash + year;
        }
        return null;
    }

    private String checkDay31(int month, int day) {
        if (day == day31) {
            day = dayOne;
            month++;
            return day + dash + month + dash + year;
        }
        return null;
    }
}
