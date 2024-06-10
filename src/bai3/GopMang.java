package bai3;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};
        int [] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i<arr1.length) {
                arr3[i] = arr1[i];
            }
            else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
