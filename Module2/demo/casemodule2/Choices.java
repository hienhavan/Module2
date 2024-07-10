package demo.casemodule2;

import demo.casemodule2.interfaces.choice;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Choices implements choice {
    private static int numberOfChoices = 1;

    public static void choice() throws IOException {
        Scanner scanner = new Scanner(System.in);
        DuplicateCustomersException e = null;
        CustomersManager medicalRecordManager = new CustomersManager();
        while (true) {
            Menu.printMenu();
try {
    int choose = Integer.parseInt(scanner.next());
    switch (choose) {
        case ADD_CUSTOMER -> handleAdd(scanner, medicalRecordManager, e);
        case DELETE_CUSTOMER -> delete(scanner, medicalRecordManager);
        case SEARCH_CUSTOMER -> searchCustomer(scanner, medicalRecordManager);
        case SHOW_CUSTOMER -> medicalRecordManager.showCustomer();
        case EXIT -> {
            System.out.println("Exit");
            System.exit(0);
        }
//        default -> System.err.println("ko co lua chon phu hop");
    }
}catch (Exception _){
    System.err.println("ko co lua chon phu hop");
}


//            int choose = Integer.parseInt(scanner.next());
//            switch (choose) {
//                case ADD_CUSTOMER -> handleAdd(scanner, medicalRecordManager, e);
//                case DELETE_CUSTOMER -> delete(scanner, medicalRecordManager);
//                case SEARCH_CUSTOMER -> searchCustomer(scanner, medicalRecordManager);
//                case SHOW_CUSTOMER -> medicalRecordManager.showCustomer();
//                case EXIT -> {
//                    System.out.println("Exit");
//                    System.exit(0);
//                }
//                default -> System.err.println("ko co lua chon phu hop");
//            }
        }
    }

    public static void handleAdd(Scanner scanner, CustomersManager medicalRecordManager, DuplicateCustomersException e) {
        Menu.printMenuAdd();
        try {
            int chooseMedicalRecord = Integer.parseInt(scanner.next());

            if (chooseMedicalRecord != REGULAR_CUSTOMER && chooseMedicalRecord != VIP_CUSTOMER) {
                System.err.println("Nhap sai");
                return;
            }

            enterCustomerInformation(scanner, medicalRecordManager, chooseMedicalRecord, e);
        } catch (NumberFormatException _) {
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void searchCustomer(Scanner scanner, CustomersManager customerManager) {
        System.out.println("Nhap ma khach hang can tim kiem");
        String name = scanner.next();

        if (customerManager.searchByCode(name) == null) {
            System.err.println("Khong tim thay khach hang");
            return;
        }
        System.out.println("khach hang co ma "+name+" la:"+ " "+ customerManager.searchByCode(name));

    }

    private static void enterCustomerInformation(Scanner scanner, CustomersManager customerManager, int chooseCustomers, DuplicateCustomersException e) throws IOException {
        System.out.println("Nhap Code");
        String code = scanner.next();
        System.out.println("Nhap ten khach hang");
        String nameCustomer = scanner.next();
        System.out.println("nhap so dien thoai");
        String phoneNumber = scanner.next();
        System.out.println("Nhap ngay gia nhap");
        String joinDate = scanner.next();
        System.out.println("Nhap ngay roi di");
        String departureDate = scanner.next();
        System.out.println("muc dich gia nhap");
        String purposeOfJoining = scanner.next();

        if (chooseCustomers == REGULAR_CUSTOMER) {
            System.out.println("Nhap so tien phai tra");
            double hospitalFee = Double.parseDouble(scanner.next());
            String regularCustomerCode = "^T-[\\d]+$";
            e = new DuplicateCustomersException("ma khach hang phai bat dau bang T- va so (vd:T-1111)");
            Customers regularCustomer = new RegularCustomers(numberOfChoices, code, nameCustomer, phoneNumber, joinDate, departureDate, purposeOfJoining, hospitalFee);
            checkTheNameOfThePatientCode(code, regularCustomer, customerManager, e, chooseCustomers, regularCustomerCode);
        }
        if (chooseCustomers == VIP_CUSTOMER) {
            System.out.println("Nhap loaiVip(1/2/3)");
            int type = Integer.parseInt(scanner.next());
            System.out.println("Thoi han Vip");
            int vipTerm = Integer.parseInt(scanner.next());
            String vipCustomerCode = "^VIP-[\\d]+$";
            e = new DuplicateCustomersException("ma khach hang phai bat dau bang VIP- va so (vd:VIP-1111)");
            Customers vipCustomer = new VipCustomers(numberOfChoices, code, nameCustomer, phoneNumber, joinDate, departureDate, purposeOfJoining, type, vipTerm);
            checkTheNameOfThePatientCode(code, vipCustomer, customerManager, e, chooseCustomers, vipCustomerCode);
        }
    }

    public static void delete(Scanner scanner, CustomersManager customerManager) {
        System.err.println("nhap ma khach hang muon xoa");
        String code = scanner.next();
        System.err.println("ban chac nhan muon xoa y/n");
        String yesOrNo = scanner.next();
        Customers mr = customerManager.searchByCode(code);
        if (mr == null) {
            System.err.println("khong co khach hang ban muon xoa");
            return;
        }
        if (!yesOrNo.equalsIgnoreCase("y")) {
            return;
        }
        customerManager.deleteCustomer(mr);
        System.err.println("da xoa thanh cong");
        numberOfChoices--;
    }

    private static void checkTheNameOfThePatientCode(String input, Customers customer, CustomersManager customersManager, DuplicateCustomersException e, int choice, String customerCode) {
        if (choice == REGULAR_CUSTOMER) {
            clientCodeFormat(input, customer, customersManager, e, customerCode);
        }
        if (choice == VIP_CUSTOMER) {
            clientCodeFormat(input, customer, customersManager, e, customerCode);
        }
    }

    private static void clientCodeFormat(String input, Customers customer, CustomersManager customersManager, DuplicateCustomersException e, String customerCode) {
        Pattern pattern = Pattern.compile(customerCode);
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            System.out.println(e.getMessage());
            return;
        }
        customersManager.addCustomer(customer);
        numberOfChoices++;
    }
    private static  void checkDate (String inputDateIn,String inputDateOut, DuplicateCustomersException e,String inputCode, Customers customer, CustomersManager customersManager, String customerCode){
        Pattern pattern = Pattern.compile("^([0-2][\\d]|3[0-1])\\/(0[\\d]|1[0-2])$");
        Matcher matcher1 = pattern.matcher(inputDateIn);
        Matcher matcher2 = pattern.matcher(inputDateOut);
        e = new DuplicateCustomersException("bann nhap sai( ngay, thang phai co dinh dang xx/yy va thang ra phai lon hon thang truoc)");
        if (!matcher1.matches() || !matcher2.matches()){
            System.out.println(e.getMessage());
            return;
        }
        String [] date1 = inputDateIn.split("/");
        int dateNumber1 = Integer.parseInt(date1[1]);
        String [] date2 = inputDateOut.split("/");
        int dateNumber2 = Integer.parseInt(date2[1]);
        if (dateNumber1 < dateNumber2){
            System.out.println(e.getMessage());
            return;
        }
clientCodeFormat();
    }
}


