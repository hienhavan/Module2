package demo.demobaithithuchanh;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Choices implements choice {
    private static int numberOfChoices = 1;

    public static void choice() throws IOException {
        Scanner scanner = new Scanner(System.in);
        DuplicateMedicalRecordException e = new DuplicateMedicalRecordException("ma benh nhan phai bat dau bang BN- va so (vd:BN-1111)");
        MedicalRecordManager medicalRecordManager = new MedicalRecordManager();
        while (true) {
            Menu.printMenu();

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case ADD_PATIENT -> handleAdd(scanner, medicalRecordManager, e);
                case DELETE_PATIENT -> delete(scanner, medicalRecordManager);
                case SHOW_PATIENT -> medicalRecordManager.showMedicalRecord();
                case EXIT -> {
                    System.out.println("Exit");
                    System.exit(0);
                }
                default -> System.err.println("ko co lua chon phu hop");
            }
        }
    }

    public static void handleAdd(Scanner scanner, MedicalRecordManager medicalRecordManager, DuplicateMedicalRecordException e) {
        Menu.printMenuAdd();
        try {
            int chooseMedicalRecord = Integer.parseInt(scanner.nextLine());

            if (chooseMedicalRecord != REGULAR_MEDICAL_RECORD && chooseMedicalRecord != VIP_MEDICAL_RECORD) {
                System.err.println("Nhap sai");
                return;
            }

            enterPatientInformation(scanner, medicalRecordManager, chooseMedicalRecord, e);
        } catch (NumberFormatException E) {
            System.err.println("nhap sai");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void enterPatientInformation(Scanner scanner, MedicalRecordManager medicalRecordManager, int chooseMedicalRecord, DuplicateMedicalRecordException e) throws IOException {
        System.out.println("Nh?p Code");
        String code = scanner.nextLine();
        System.out.println("Nh?p tên b?nh án");
        String namePatient = scanner.nextLine();
        System.out.println("Nh?p ngày nh?p vi?n");
        String hospitalizedDay = scanner.nextLine();
        System.out.println("Nh?p ngày ra vi?n");
        String hospitalDischargeDate = scanner.nextLine();
        System.out.println("Lý do nh?p vi?n");
        String reasonForHospitalization = scanner.nextLine();

        if (chooseMedicalRecord == REGULAR_MEDICAL_RECORD) {
            System.out.println("Nhap so tien phai tra");
            double hospitalFee = Double.parseDouble(scanner.nextLine());
            MedicalRecord regularMedicalRecord = new RegularMedicalRecord(numberOfChoices, code, namePatient, hospitalizedDay, hospitalDischargeDate, reasonForHospitalization, hospitalFee);
            checkTheNameOfThePatientCode(code, regularMedicalRecord, medicalRecordManager, e);
        }
        if (chooseMedicalRecord == VIP_MEDICAL_RECORD) {
            System.out.println("Nhap loai phong Vip(1/2/3)");
            int type = Integer.parseInt(scanner.nextLine());
            System.out.println("Thoi han Vip");
            int duration = Integer.parseInt(scanner.nextLine());
            MedicalRecord vipMedicalRecord = new VipMedicalRecord(numberOfChoices, code, namePatient, hospitalizedDay, hospitalDischargeDate, reasonForHospitalization, type, duration);
            checkTheNameOfThePatientCode(code, vipMedicalRecord, medicalRecordManager, e);
        }
    }

    public static void delete(Scanner scanner, MedicalRecordManager medicalRecordManager) throws IOException {
        System.err.println("nhap ma benh an muon xoa");
        String code = scanner.nextLine();
        System.err.println("nhap ma benh an muon xoa y/n");
        String yesOrNo = scanner.nextLine();
        MedicalRecord mr = medicalRecordManager.searchByCode(code);
        if (mr == null) {
            System.err.println("khong co benh nhan ban muon xoa");
            return;
        }
        if (!yesOrNo.equalsIgnoreCase("y")) {
            return;
        }
        medicalRecordManager.deleteMedicalRecord(mr);
        System.err.println("da xoa thanh cong");
        numberOfChoices--;
    }

    private static void checkTheNameOfThePatientCode(String input, MedicalRecord mr, MedicalRecordManager medicalRecordManager, DuplicateMedicalRecordException e) throws IOException {
        Pattern pattern = Pattern.compile("^BN-[\\d]+$");
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            System.out.println(e.getMessage());
            return;
        }
        medicalRecordManager.addMedicalRecord(mr);
        numberOfChoices++;
    }
}


