package demo.enums;

public class Main {
    public static void main(String[] args) {
        Enums start = Enums.DAT_HANG;
        System.out.println(start);
        for (Enums s : Enums.values()) {
            System.out.println(s);
        }
    }
}
