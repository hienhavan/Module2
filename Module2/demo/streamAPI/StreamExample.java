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
//        Công d?ng: L?c các ph?n t? d?a trên m?t ?i?u ki?n cho tr??c.
//                Cách th?c hi?n: Tr? v? m?t Stream ch?a các ph?n t? tho? mãn ?i?u ki?n ???c cung c?p b?i predicate.

        List<String> name1 = Arrays.asList("John", "Emma", "David", "Sophia", "James");
        List<String> filteredNames = name1.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(filteredNames); // Output: [John, James]

//        map()
//        Công d?ng: Ánh x? (transform) các ph?n t? t? m?t ki?u d? li?u sang ki?u d? li?u khác.
//        Cách th?c hi?n: Tr? v? m?t Stream ch?a k?t qu? c?a vi?c ánh x? t?ng ph?n t? theo m?t hàm ?ã cho.

        List<String> name2 = Arrays.asList("John", "Emma", "David");
        List<String> upperCaseNames = name2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames); // Output: [JOHN, EMMA, DAVID]

//        sorted()
//        Công d?ng: S?p x?p các ph?n t? c?a Stream.
//                Cách th?c hi?n: Tr? v? m?t Stream ?ã ???c s?p x?p (m?c ??nh là theo th? t? t?ng d?n)

        List<Integer> number3 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
        List<Integer> sortedNumbers = number3.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers); // Output: [1, 1, 2, 3, 4, 5, 5, 6, 9]


        /**
         * Ph??ng th?c k?t thúc
         */

//        collect()
//        Công d?ng: Thu th?p các ph?n t? trong Stream vào m?t c?u trúc d? li?u c? th? (ví d?: List, Set, Map).
//        Cách th?c hi?n: Tr? v? k?t qu? sau khi thu th?p các ph?n t? t? Stream.

        List<String> name4 = Arrays.asList("John", "Emma", "David");
        Set<String> nameSet = name4.stream()
                .collect(Collectors.toSet());
        System.out.println(nameSet); // Output: [Emma, David, John]


        //count()
        //Công d?ng: ??m s? l??ng ph?n t? trong Stream.
        //Cách th?c hi?n: Tr? v? s? nguyên là s? l??ng ph?n t? trong Stream

        List<String> name5= Arrays.asList("John", "Emma", "David");
        long count = name5.stream()
                .count();
        System.out.println(count); // Output: 3

    }
}
