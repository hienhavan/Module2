package demo;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        int sum = 0;
        for (;;){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap vao so 1");
            int n = scanner.nextInt();
            System.out.println("nhap vao so 2");
            int m = scanner.nextInt();
            if (n<m){
                for (int i = n ;n<m;n++){
sum += m;}
                System.out.println("tong tu so 1 den 2 la:"+ sum);
                break;
            }
        }
    }
}
