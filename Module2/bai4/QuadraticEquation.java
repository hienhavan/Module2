package bai4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public static double getDiscriminant(double a, double b, double c) {
        return Math.pow(b,2)-4*a*c;
    }
    public static double getRoot1(double a,double b,double c) {
        return (-b+Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
    }
    public static double getRoot2(double a,double b,double c) {
        return (-b-Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao a");
        double a = scanner.nextDouble();
        System.out.println("nhap vao b");
        double b = scanner.nextDouble();
        System.out.println("nhap vao c");
        double c = scanner.nextDouble();
        if (QuadraticEquation.getDiscriminant(a,b,c) > 0){
            System.out.println("phuong trinh co 2 nghiem phan biet");
            System.out.println("nghiem thu nhat la: " + QuadraticEquation.getRoot1(a,b,c));
            System.out.println("nghiem thu hai la: " + QuadraticEquation.getRoot2(a,b,c));
        }
        else if (QuadraticEquation.getDiscriminant(a,b,c) == 0){
            System.out.println("phuong trinh co nghiem kep");
            System.out.println("nghiem kep la: " + QuadraticEquation.getRoot1(a,b,c));
        }
        else if (QuadraticEquation.getDiscriminant(a,b,c) < 0){
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
