package bai3;

public class DemKyTuXuatHien {
    public static void main(String[] args) {
        String str = "hello";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println(count);
    }
}
