package bai15;

import bai15.IllegalTriangleException;

import java.util.Scanner;

public class CheckThe3SidesOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ 1:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào cạnh thứ 2:");
        int b = scanner.nextInt();
        System.out.println("Nhập vào cạnh thứ 3:");
        int c = scanner.nextInt();

        try {
            checkTriangleValidity(a, b, c);
            System.out.println("Đây là 3 cạnh của một tam giác.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private static void checkTriangleValidity(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Một hoặc nhiều cạnh của tam giác <= 0.");
        }
        if (!(a + b > c && a + c > b && b + c > a)) {
            throw new IllegalTriangleException("Không thỏa mãn điều kiện để tạo thành tam giác.");
        }
    }
}
