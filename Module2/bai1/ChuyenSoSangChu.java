package bai1;

import java.util.Scanner;

public class ChuyenSoSangChu {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao 1 so n (0>n<10) :");
            try {
                int n = scanner.nextInt();
                switch (n) {
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                    default:
                        System.out.println("khong hop le");
                }
            } catch (Exception e) {
                System.out.println("out of ability");
            }
    }
}
