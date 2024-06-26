package bai13;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String chuoi = scanner.nextLine();
        String[] lines = chuoi.split(",");
        int[] number = new int[lines.length];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(lines[i]);
        }
        Arrays.sort(number);
        System.out.println(STR."day sau khi da sap xep:\{Arrays.toString(number)}");
        int start = 0;
        int end = number.length - 1;
        TimKiemNhiPhan.binarySearch(number, start, end, 12);
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {

            System.out.println("so can tim nam so vi tri thu" + " " + middle + " " + "trong day");
            return middle;
        }
        if (array[middle] > value) {
            binarySearch(array, left, middle - 1, value);
        }
        if (array[middle] < value) {
            binarySearch(array, middle + 1, right, value);
        }
        return -1;
    }
}
