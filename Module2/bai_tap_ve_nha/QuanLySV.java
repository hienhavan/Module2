package bai_tap_ve_nha;

import bai_tap_ve_nha.QuanLyMaSinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySV {
    public static void main(String[] args) {
        ArrayList<QuanLyMaSinhVien> list = new ArrayList<QuanLyMaSinhVien>();
        list.add(new QuanLyMaSinhVien(1, "nguyen", "nguyen54321@gmail.com", 999999999, 5));
        list.add(new QuanLyMaSinhVien(2, "hai", "hai54321@gmail.com", 999999999, 3));
        list.add(new QuanLyMaSinhVien(3, "ha", "ha54321@gmail.com", 9999, 4));
        System.out.println("Danh sách ban đầu: " + list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên:");
        int id = scanner.nextInt();
        System.out.println("Nhập tên sinh viên:");
        String name = scanner.next();
        System.out.println("Nhập số điện thoại:");
        int number = scanner.nextInt();
        System.out.println("Nhập email:");
        String email = scanner.next();
        System.out.println("Nhập GPA:");
        int GPA = scanner.nextInt();
        list.add(new QuanLyMaSinhVien(id, name, email, number, GPA));
        System.out.println("Danh sách sau khi thêm: " + list);

        System.out.println("lựa chọn (1) để hiện thị sv, lựa chọn (2) để xóa sv ");
        int choice = scanner.nextInt();
        System.out.println("Nhập mã sinh viên:");
        int idInput = scanner.nextInt();

        if (choice == 2) {
            QuanLyMaSinhVien svToRemove = null;
            for (QuanLyMaSinhVien sv : list) {
                if (sv.MaSinhVien == idInput) {
                    svToRemove = sv;
                    break;
                }
            }
            if (svToRemove != null) {
                list.remove(svToRemove);
                System.out.println(list);
            } else {
                System.out.println("Không tìm thấy sinh viên với mã sinh viên đã nhập.");
            }
        }
    }
}
