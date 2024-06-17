package demo.baitapvenha2;

import java.util.Arrays;

public class EmployeeManager implements Function {
    private Staff[] Employee;
    private int limit;
    private int size;

    public EmployeeManager(int limit) {
        this.limit = limit;
        Employee = new Staff[limit];
        this.size = 0;
    }

    @Override
    public void create(Staff nv) {
        if (size < limit) {
            Employee[size] = nv;
            size++;
            System.out.println("Them moi thanh cong:");
            for (Staff staff : Employee) {
                if (staff != null) {
                    System.out.println(staff);
                }
            }
        } else {
            System.out.println("Danh sach da day:");
            for (Staff staff : Employee) {
                if (staff != null) {
                    System.out.println("Danh sách hiện tại:" + staff);
                }
            }
        }
    }

    @Override
    public void read(String name) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (Employee[i].getName().equals(name)) {
                System.out.println("Thông tin nhân viên có tên: " + name);
                System.out.println(Employee[i].toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhân viên có tên: " + name);
        }
    }

    @Override
    public void update(Staff nv) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (Employee[i].getId() == nv.getId()) {
                Employee[i] = nv;
                System.out.println("Sua thanh cong:");
                check = true;
                for (Staff staff : Employee) {
                    if (staff != null) {
                        System.out.println("Danh sách hiện tại:" + staff);
                    }
                }
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhân viên có ID: " + nv.getId());
        }
    }

    @Override
    public void delete(int id) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (Employee[i].getId() == id) {
                Employee[i] = null;
                size--;
                check = true;
                System.out.println("Xóa thành công nhân viên có ID: " + id);
                for (Staff staff : Employee) {
                    if (staff != null) {
                        System.out.println("Danh sách hiện tại:" + staff);
                    }
                }
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhân viên có ID: " + id);
        }
    }

    public void display() {
        int offceCount = 0;
        int factoryCount = 0;
        int deliveryCount = 0;
        for (Staff employee : Employee) {
            if (employee instanceof Offce) {
                offceCount++;
                System.out.println(" nhân viên văn phòng:" + employee);
            } else if (employee instanceof Factory) {
                factoryCount++;
                System.out.println("nhân viên công xưởng:" + employee);
            } else if (employee instanceof Delivery) {
                deliveryCount++;
                System.out.println("nhân viên giao hàng: " + employee);
            }
        }

        System.out.println("Số lượng nhân viên văn phòng: " + offceCount);
        System.out.println("Số lượng nhân viên công xưởng: " + factoryCount);
        System.out.println("Số lượng nhân viên giao hàng: " + deliveryCount);
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "Employees=" + Arrays.toString(Employee) +
                '}';
    }
}
