package bai13;

import java.util.Arrays;
import java.util.Scanner;

public class TimChuoiTanggDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi");
        String chain = scanner.nextLine();
        char[] Characters = chain.toCharArray();
        Arrays.sort(Characters);
        String chain2 = new String(Characters);
        System.out.println(chain2);
        for (int i = 0; i < Characters.length; i++) {
            for (int j = i + 1; j < Characters.length; j++) {
                if (Characters[i] > Characters[j]) {
                    char temp = Characters[i];
                    Characters[i] = Characters[j];
                    Characters[j] = temp;
                }
            }
        }
        System.out.println(Characters);
    }
}
