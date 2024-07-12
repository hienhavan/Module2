package baithithuchanh;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Choices implements choice {
    private static int automaticId = 1;

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        TelephoneManager manager = new TelephoneManager();
        while (true) {
            Menu.printMenu();
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case ADD:
                        handleAdd(scanner, manager);
                        break;
                    case DELETE:
                        delete(scanner, manager);
                        break;
                    case SEARCH:
                        search(scanner, manager);
                        break;
                    case SHOW_ALL:
                        manager.showPhone();
                        break;
                    case EXIT:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Khong co lua chon phu hop.");
                }
            } catch (NumberFormatException _) {
            }
        }
    }

    public static void handleAdd(Scanner scanner, TelephoneManager telephoneManager) {
        Menu.printMenuAdd();
        try {
            int chooseMedicalRecord = Integer.parseInt(scanner.nextLine());

            if (chooseMedicalRecord != RORIGINAL_PHONE && chooseMedicalRecord != PORTABLE_PHONES) {
                System.err.println("Nhap sai");
                return;
            }

            enterPhoneInformation(scanner, telephoneManager, chooseMedicalRecord);
        } catch (Exception _) {
        }
    }

    private static void enterPhoneInformation(Scanner scanner, TelephoneManager phoneManager, int chooseMedicalRecord) throws IOException {
        System.out.println("Nhap ten dien thoai");
        String namePhone = scanner.nextLine();
        System.out.println("Nhap gia ban");
        double price = scanner.nextDouble();
        System.out.println("nhap so luong");
        int amount = scanner.nextInt();
        System.out.println("Nha san xuat");
        String manufacturer = scanner.next();

        if (chooseMedicalRecord == RORIGINAL_PHONE) {
            System.out.println("Nhap thoi gian bao hanh");
            int warrantyPeriod = Integer.parseInt(scanner.next());
            System.out.println("Nhap pham vi bao hanh");
            String warrantyCoverage = scanner.next();
            Telephone phone = new GenuinePhone(automaticId, namePhone, price, amount, manufacturer, warrantyPeriod, warrantyCoverage);
            phoneManager.addPhone(phone);
            automaticId++;
        }
        if (chooseMedicalRecord == PORTABLE_PHONES) {
            System.out.println("quoc gia xach tay)");
            String country = scanner.next();
            System.out.println("trang thai");
            String condition = scanner.next();
            Telephone phone = new PortablePhones(automaticId, namePhone, price, amount, manufacturer, country, condition);
            phoneManager.addPhone(phone);
            automaticId++;
        }
    }

    public static void delete(Scanner scanner, TelephoneManager phoneManager) {
        System.out.println("nhap id ban muon xoa");
        int id = scanner.nextInt();
        System.err.println("ban chac chan muon xoa muon xoa y/n");
        String yesOrNo = scanner.next();
        Telephone mr = phoneManager.searchByid(id);
        if (mr == null) {
            System.err.println("khong co benh nhan ban muon xoa");
            return;
        }
        if (!yesOrNo.equalsIgnoreCase("y")) {
            return;
        }
        phoneManager.deletePhone(mr);
        System.err.println("da xoa thanh cong");
        automaticId--;
    }

    public static void search(Scanner scanner, TelephoneManager phoneManager) {
        System.out.println("nhap id muon hien thi");
        int id = scanner.nextInt();
        phoneManager.searchByid(id);
    }
    public void isValidQuantity(int quantity) throws Exception {
        if (quantity < 0) {
            throw new Exception("Invalid quantity");
        }
    }

    public void isValidType(String type) throws Exception {
        if (!type.equals("authentic") && !type.equals("hand good")) {
            throw new Exception("Invalid type");
        }
    }

    public void isValidPrice(double price) throws Exception {
        if (price < 0) {
            throw new Exception("Invalid price");
        }
    }

    public void isValidInsuranceDay(int insuranceDay) throws Exception {
        int minInsuranceDay = 0;
        int maxInsuranceDay = 730;
        if (insuranceDay < minInsuranceDay || insuranceDay > maxInsuranceDay) {
            throw new Exception("Invalid insurance day");
        }
    }

    public void isValidScope(String scope) throws Exception {
        String local = "Toan Quoc";
        String global = "Quoc Te";
        if (!scope.equals(global) && !scope.equals(local)) {
            throw new Exception("Invalid scope");
        }
    }

    public void isValidCountry(String country) throws Exception {
        String banned = "Viet Nam";
        if (country.equals(banned)) {
            throw new Exception("Invalid country");
        }
    }

    public void isValidStatus(String status) throws Exception {
        String[] validStatus = {"Da sua chua", "Chua sua chua"};
        if (!status.equals(validStatus[0]) && !status.equals(validStatus[1])) {
            throw new Exception("Invalid status");
        }
    }

}
