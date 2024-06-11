package bai3;

import java.util.Scanner;

public class BtThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("nhap vi tri can them : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" nhap so can them : ");
        int x = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < n) {
                newArr[i] = arr[i];
            } else if (i == n) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
