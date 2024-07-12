package baithithuchanh;

import java.util.Scanner;

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

    private static void enterPhoneInformation(Scanner scanner, TelephoneManager phoneManager, int chooseMedicalRecord) {
        System.out.println("Nhap ten dien thoai");
        String namePhone = scanner.nextLine();
        System.out.println("Nhap gia ban");
        double price = Double.parseDouble(scanner.nextLine());
        if (isValidPrice(price)) {
            System.err.println("Gia ban phai la so thuc duong");
            return;
        }

        System.out.println("nhap so luong");
        int amount = Integer.parseInt(scanner.nextLine());
        if (isValidQuantity(amount)) {
            System.err.println("So luong phai la so nguyen duong");
            return;
        }
        System.out.println("Nha san xuat");
        String manufacturer = scanner.nextLine();

        if (isValidType(manufacturer)) {
            System.err.println("Nha san xuat khong hop le");
            return;
        }

        if (chooseMedicalRecord == RORIGINAL_PHONE) {
            System.out.println("Nhap thoi gian bao hanh");
            int warrantyPeriod = Integer.parseInt(scanner.nextLine());
            if (isValidInsuranceDay(warrantyPeriod)) {
                System.err.println("Thoi gian bao hanh khong hop le");
                return;
            }
            System.out.println("Nhap pham vi bao hanh");
            String warrantyCoverage = scanner.nextLine();
            if (isValidScope(warrantyCoverage)) {
                System.err.println("Pham vi bao hanh khong hop le");
                return;
            }
            Telephone phone = new GenuinePhone(automaticId, namePhone, price, amount, manufacturer, warrantyPeriod, warrantyCoverage);
            phoneManager.addPhone(phone);
            automaticId++;
        }
        if (chooseMedicalRecord == PORTABLE_PHONES) {
            System.out.println("quoc gia xach tay");
            String country = scanner.nextLine();
            if (isValidCountry(country)) {
                System.err.println("quoc gia xach tay khong hop le");
                return;
            }
            System.out.println("trang thai");
            String condition = scanner.nextLine();
            if (isValidStatus(condition)) {
                System.err.println("trang thai khong hop le");
                return;
            }
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

    public static boolean isValidQuantity(int quantity) {
        return quantity < 0;
    }

    public static boolean isValidType(String type) {
        return !type.equals("chinh hang") && !type.equals("xach tay");
    }

    public static boolean isValidPrice(double price) {
        return price < 0;
    }

    public static boolean isValidInsuranceDay(int insuranceDay) {
        boolean checked = false;
        int minInsuranceDay = 0;
        int maxInsuranceDay = 730;
        if (insuranceDay < minInsuranceDay || insuranceDay > maxInsuranceDay) {
            checked = true;
        }
        return checked;
    }

    public static boolean isValidScope(String scope) {
        boolean checked = false;
        String local = "Toan Quoc";
        String global = "Quoc Te";
        if (!scope.equals(global) && !scope.equals(local)) {
            checked = true;
        }
        return checked;
    }

    public static boolean isValidCountry(String country) {
        boolean checked = false;
        String banned = "Viet Nam";
        if (country.equals(banned)) {
            checked = true;
        }
        return checked;
    }

    public static boolean isValidStatus(String status) {
        boolean checked = false;
        String[] validStatus = {"Da sua chua", "Chua sua chua"};
        if (!status.equals(validStatus[0]) && !status.equals(validStatus[1])) {
            checked = true;
        }
        return checked;
    }

}
