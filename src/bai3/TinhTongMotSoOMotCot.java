package bai3;

public class TinhTongMotSoOMotCot {
    public static int  tinhTong (int [][]a,int b){
        int sum = 0;
        for (int i = 0;i<a.length;i++ ){
            sum += a[i][b];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4,4},{2,3,41,2,4},{12,34,12,3,12}};
int tong = tinhTong(arr,2);
        System.out.println(tong);
    }
}
