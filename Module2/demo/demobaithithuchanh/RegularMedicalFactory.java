//package demo.demobaithithuchanh;
//
//import java.util.Scanner;
//
//
//
//public class RegularMedicalFactory implements MedicalRecordFactory,choice {
//    Scanner scanner = new Scanner(System.in);
//    @Override
//    public MedicalRecord createMedicalRecord(int id, String code, String namePatient, String hospitalizedDay, String hospitalDischargeDate, String reasonForHospitalization) {
//        System.out.println("Nh?p s? ti?n ph?i tr?:");
//        double hospitalFee = Double.parseDouble(scanner.nextLine());
//        return new RegularMedicalRecord(id, code, namePatient, hospitalizedDay, hospitalDischargeDate, reasonForHospitalization, hospitalFee);
//
//        System.out.println("Nh?p lo?i phòng VIP (1/2/3):");
//        int type = Integer.parseInt(scanner.nextLine());
//        System.out.println("Th?i h?n VIP:");
//        int duration = Integer.parseInt(scanner.nextLine());
//        return new VipMedicalRecord(id, code, namePatient, hospitalizedDay, hospitalDischargeDate, reasonForHospitalization, type, duration);
//    }
//    public MedicalRecord regularMedicalRecord (Scanner scanner){
//        System.out.println("Nh?p s? ti?n ph?i tr?:");
//        double hospitalFee = Double.parseDouble(scanner.nextLine());
//        return new RegularMedicalRecord(id, code, namePatient, hospitalizedDay, hospitalDischargeDate, reasonForHospitalization, hospitalFee);
//    }
//}
//
//
