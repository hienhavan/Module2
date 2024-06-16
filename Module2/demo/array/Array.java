package demo.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[array1.length];
        int index = Arrays.binarySearch(array1, 3);
        System.out.println(index);
        int[] array4 = {1, 2, 3};
        int hashCode = Arrays.hashCode(array4);
        System.out.println(hashCode);
        int [] array3 = Arrays.copyOf(array1, 3);
        System.out.println(Arrays.toString(array3));
    }
}
