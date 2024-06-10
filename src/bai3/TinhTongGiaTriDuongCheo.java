package bai3;

public class TinhTongGiaTriDuongCheo {
    public static int tinhTongGiaTriDuongCheo(int[][] a) {
        int sum = 0;
        int dem = 0;
        for (int i = 0;i<a.length;i++ ){
            sum += a[i][dem];
            dem++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{2,3,2,4},{12,12,3,12}};
        int tong = tinhTongGiaTriDuongCheo(arr);
        System.out.println(tong);
    }
}
