package demo.streamAPI;//package demo.array;
//
//import java.util.Arrays;
//
//public class Array {
//    public static void main(String[] args) {
//        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] array2 = new int[array1.length];
//        int index = Arrays.binarySearch(array1, 3);
//        String[] array5 = {"a","b","c","d","e","f"};
//        System.out.println(index);
//        int[] array4 = {1, 2, 3};
//        int hashCode = Arrays.hashCode(array4);
//        System.out.println(hashCode);
//        int [] array3 = Arrays.copyOf(array1, 3);
//        System.out.println(Arrays.toString(array3));
//    }
//}
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
       /** *Ph??ng th?c trung gian */


//        filter()
//        C�ng d?ng: L?c c�c ph?n t? d?a tr�n m?t ?i?u ki?n cho tr??c.
//                C�ch th?c hi?n: Tr? v? m?t Stream ch?a c�c ph?n t? tho? m�n ?i?u ki?n ???c cung c?p b?i predicate.

        List<String> name1 = Arrays.asList("John", "Emma", "David", "Sophia", "James");
        List<String> filteredNames = name1.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(filteredNames); // Output: [John, James]

//        map()
//        C�ng d?ng: �nh x? (transform) c�c ph?n t? t? m?t ki?u d? li?u sang ki?u d? li?u kh�c.
//        C�ch th?c hi?n: Tr? v? m?t Stream ch?a k?t qu? c?a vi?c �nh x? t?ng ph?n t? theo m?t h�m ?� cho.

        List<String> name2 = Arrays.asList("John", "Emma", "David");
        List<String> upperCaseNames = name2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames); // Output: [JOHN, EMMA, DAVID]

//        sorted()
//        C�ng d?ng: S?p x?p c�c ph?n t? c?a Stream.
//                C�ch th?c hi?n: Tr? v? m?t Stream ?� ???c s?p x?p (m?c ??nh l� theo th? t? t?ng d?n)

        List<Integer> number3 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
        List<Integer> sortedNumbers = number3.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers); // Output: [1, 1, 2, 3, 4, 5, 5, 6, 9]


        /**
         * Ph??ng th?c k?t th�c
         */

//        collect()
//        C�ng d?ng: Thu th?p c�c ph?n t? trong Stream v�o m?t c?u tr�c d? li?u c? th? (v� d?: List, Set, Map).
//        C�ch th?c hi?n: Tr? v? k?t qu? sau khi thu th?p c�c ph?n t? t? Stream.

        List<String> name4 = Arrays.asList("John", "Emma", "David");
        Set<String> nameSet = name4.stream()
                .collect(Collectors.toSet());
        System.out.println(nameSet); // Output: [Emma, David, John]


        //count()
        //C�ng d?ng: ??m s? l??ng ph?n t? trong Stream.
        //C�ch th?c hi?n: Tr? v? s? nguy�n l� s? l??ng ph?n t? trong Stream

        List<String> name5= Arrays.asList("John", "Emma", "David");
        long count = name5.stream()
                .count();
        System.out.println(count); // Output: 3

    }
}
