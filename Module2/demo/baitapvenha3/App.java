package demo.baitapvenha3;

public class App {
    public static void main(String[] args) {
        ConvertSystem converter = new ConvertCounterSystem();

        int decimalNumber = 123;

        String binary = converter.convertBinary(decimalNumber);
        String octal = converter.convertOctal(decimalNumber);
        String hexadecimal = converter.convertHexadecimal(decimalNumber);
        String decimal = converter.convertDecimal(decimalNumber);

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}
