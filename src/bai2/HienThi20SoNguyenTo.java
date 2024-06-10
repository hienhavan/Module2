package bai2;

public class HienThi20SoNguyenTo {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        int nums =2;;
        while (count < 20) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        while (nums < 100) {
           if (isPrime(nums)) {
               System.out.println(nums);
           }
            nums++;
        }
    }
}
