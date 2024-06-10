package bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChuyenDoiTien {
    public static final int INT = 23000;

    public static void main(String[] args) {
        System.out.printf("nhap vao so tien USD:");
        Scanner n = new Scanner(System.in);
        try {
            int sotien = n.nextInt();
            System.out.println(sotien * INT);
        } catch (InputMismatchException e) {
            System.out.println("khong hop le");
        }
    }
}
