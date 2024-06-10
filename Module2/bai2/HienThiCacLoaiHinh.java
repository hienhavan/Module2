package bai2;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
