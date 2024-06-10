package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                count++;
            }
        }
        int[] arrs = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                arrs[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrs));
    }
}
