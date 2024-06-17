package demo.baitapvenha2;

import java.util.Arrays;

public class EmployeeManager implements Function {
    private Staff[] employee;
    private int limit;
    private int sizeArray;

    public EmployeeManager(int limit) {
        this.limit = limit;
        employee = new Staff[limit];
        this.sizeArray = 0;
    }

    @Override
    public void create(Staff nv) {
        if (sizeArray < limit) {
            employee[sizeArray] = nv;
            sizeArray++;
            System.out.println("Them moi thanh cong:");
            for (Staff staff : employee) {
                if (staff != null) {
                    System.out.println(staff);
                }
            }
        } else {
            System.out.println("Danh sach da day:");
            for (Staff staff : employee) {
                if (staff != null) {
                    System.out.println("Danh sách hiện tại:" + staff);
                }
            }
        }
    }

    @Override
    public void read(String name) {
        boolean check = false;
        for (int i = 0; i < sizeArray; i++) {
            if (employee[i].getName().equals(name)) {
                System.out.println("Thông tin nhân viên có tên: " + name);
                System.out.println(employee[i].toString());
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
        for (int i = 0; i < sizeArray; i++) {
            if (employee[i].getId() == nv.getId()) {
                employee[i] = nv;
                System.out.println("Sua thanh cong:");
                check = true;
                for (Staff staff : employee) {
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
        for (int i = 0; i < sizeArray; i++) {
            if (employee[i].getId() == id) {
                employee[i] = null;
                sizeArray--;
                check = true;
                System.out.println("Xóa thành công nhân viên có ID: " + id);
                for (Staff staff : employee) {
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
        for (Staff employee : employee) {
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
                "Employees=" + Arrays.toString(employee) +
                '}';
    }
}
