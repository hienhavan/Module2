package bai9.triangle;

public class Triangle {
    public static String checkTriangle(int a, int b, int c) {
        if (inputValueInvalid(a, b, c)) {
            return "Gia tri dau vao khong thoa man";
        }
        if (isNotATriangle(a, b, c)) {
            return "Khong phai la tam giac";
        }
        if (isaEquilateralTriangle(a, b, c)) {
            return "La tam giac deu";
        }
        if (isaIsoscelesTriangle(a, b, c)) {
            return "La tam giac can";
        }
        if (isaSquareTriangle(a, b, c)) {
            return "La tam giac vuong";
        }
        return "La tam giac";
    }

    private static boolean inputValueInvalid(int a, int b, int c) {
        return a <= 0 || b <= 0 || c <= 0;
    }

    private static boolean isNotATriangle(int a, int b, int c) {
        return a + b <= c || a + c <= b || b + c <= a;
    }

    private static boolean isaEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isaSquareTriangle(int a, int b, int c) {
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }

    private static boolean isaIsoscelesTriangle(int a, int b, int c) {
        return a == b || a == c || b == c;
    }
}
