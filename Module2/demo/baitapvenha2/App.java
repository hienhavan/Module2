package demo.baitapvenha2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeManager f = new EmployeeManager(3);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n Menu");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Tìm kiếm thông tin nhân viên");
            System.out.println("3. Sửa đổi thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập chức năng bạn muốn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    f.display();
                    searchEmployee();
                    break;
                case 3:
                    f.display();
                    updateEmployee();
                    break;
                case 4:
                    f.display();
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("Đang thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    private static void addEmployee() {
        System.out.println("Chọn loại nhân viên (1). Nhân viên giao hàng (2). Nhân viên công xưởng (3) Nhân viên văn phòng");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập mã nhân viên: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập số điện thoại nhân viên: ");
        String phone = scanner.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập chức vụ nhân viên: ");
        String position = scanner.nextLine();
        if (type == 1) {
            System.out.print("Nhập bậc của nhân viên giao hàng: ");
            int deliveryLevel = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập loại xe chuyên dùng: ");
            String carType = scanner.nextLine();
            Staff staff = new Delivery(id, phone, name, position, deliveryLevel, carType);
            f.create(staff);
            f.display();
        } else if (type == 2) {
            System.out.print("Nhập bậc của nhân viên công xưởng: ");
            int factoryLevel = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập mã nhà máy: ");
            int factoryId = scanner.nextInt();
            Staff staff = new Factory(id, phone, name, position, factoryLevel, factoryId);
            f.create(staff);
            f.display();
        } else if (type == 3) {
            Staff staff = new Offce(id, phone, name, position);
            f.create(staff);
            f.display();
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void searchEmployee() {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String name = scanner.nextLine();
        f.read(name);
    }

    private static void updateEmployee() {
        System.out.print("Nhập mã nhân viên cần sửa đổi: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập số điện thoại mới: ");
        String phone = scanner.nextLine();

        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();

        System.out.print("Nhập chức vụ mới: ");
        String position = scanner.nextLine();

        Staff updatedStaff = new Offce(id, phone, name, position);
        f.update(updatedStaff);
    }

    private static void deleteEmployee() {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        f.delete(id);
    }
}
