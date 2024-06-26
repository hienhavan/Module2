package demo.baitapvenha3;

public class ConvertCounterSystem implements ConvertSystem {

    @Override
    public String convertBinary(int number) {
        return convertToBase(number, 2);
    }

    @Override
    public String convertOctal(int number) {
        return convertToBase(number, 8);
    }

    @Override
    public String convertHexadecimal(int number) {
        return convertToBase(number, 16);
    }

    @Override
    public String convertDecimal(int number) {
        return String.valueOf(number);
    }

    private String convertToBase(int number, int base) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            result.insert(0, getCharFromDigit(remainder));
            number /= base;
        }
        return result.toString();
    }

    private char getCharFromDigit(int digit) {
        if (digit >= 0 && digit <= 9) {
            return (char) (digit + '0');
        } else {
            return (char) (digit - 10 + 'A');
        }
    }
}
