package bai14;

import java.util.Arrays;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int[] s = {1, 2, 4, 8, 5, 0, 7, 9, 6};
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] > s[j]) {
                    int temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
            System.out.println(Arrays.toString(s));
        }
    }
}
