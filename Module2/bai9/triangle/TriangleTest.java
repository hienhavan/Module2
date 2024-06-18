package bai9.triangle;

import org.junit.jupiter.api.Test;

class TriangleTest {
    @Test
    public void testTriangleWithEdgeAIsZero() {
        int a = 0;
        int b = 3;
        int c = 4;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testTriangleWithEdgeBIsZero() {
        int a = 3;
        int b = 0;
        int c = 2;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testTriangleWithEdgeCIsZero() {
        int a = 1;
        int b = 4;
        int c = 0;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testTriangleWithEdgeAIsNegative() {
        int a = -2;
        int b = 4;
        int c = 5;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testTriangleWithEdgeBIsNegative() {
        int a = 2;
        int b = -1;
        int c = 6;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testTriangleWithEdgeCIsNegative() {
        int a = 4;
        int b = 2;
        int c = -3;
        String expected = "Gia tri dau vao khong thoa man";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testNotIsTriangleEdgeA() {
        int a = 1;
        int b = 2;
        int c = 3;
        String expected = "Khong phai la tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testNotIsTriangleEdgeB() {
        int a = 3;
        int b = 1;
        int c = 2;
        String expected = "Khong phai la tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testNotIsTriangleEdgeC() {
        int a = 1;
        int b = 3;
        int c = 2;
        String expected = "Khong phai la tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsTriangle() {
        int a = 2;
        int b = 4;
        int c = 3;
        String expected = "La tam giac";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsIsoscelesTriangleEdgeA() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "La tam giac can";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsIsoscelesTriangleEdgeB() {
        int a = 2;
        int b = 3;
        int c = 2;
        String expected = "La tam giac can";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsIsoscelesTriangleEdgeC() {
        int a = 3;
        int b = 2;
        int c = 2;
        String expected = "La tam giac can";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "La tam giac deu";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsSquareTriangleEdgeA() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "La tam giac vuong";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsSquareTriangleEdgeB() {
        int a = 5;
        int b = 4;
        int c = 3;
        String expected = "La tam giac vuong";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }

    @Test
    public void testIsSquareTriangleEdgeC() {
        int a = 3;
        int b = 5;
        int c = 4;
        String expected = "La tam giac vuong";
        String actual = Triangle.checkTriangle(a, b, c);
        assert expected.equals(actual);
    }
}