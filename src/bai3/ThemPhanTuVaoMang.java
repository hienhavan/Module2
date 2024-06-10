package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int [] arr = {1,3,24,5,2,8};
        int [] arr1 = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu muon them vao mang");
        int n = scanner.nextInt();
        arr1[arr1.length - 1] = n;
        System.out.println(Arrays.toString(arr1));
    }
}
