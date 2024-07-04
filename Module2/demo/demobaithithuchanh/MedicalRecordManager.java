package demo.demobaithithuchanh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class MedicalRecordManager extends DuplicateMedicalRecordException {
    DuplicateMedicalRecordException e;

    private final Map<String, MedicalRecord> medicalRecordMap;

    public MedicalRecordManager() {
        this.medicalRecordMap = new HashMap<>();
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        if (medicalRecordMap.containsKey(medicalRecord.getCode())) {
            e = new DuplicateMedicalRecordException();
            System.out.println(e.getMessage());
            return;
        }
        medicalRecordMap.put(medicalRecord.getCode(), medicalRecord);
        System.err.println("them moi thanh cong");
        writeMedicalRecord(medicalRecordMap);
    }

    public void deleteMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordMap.remove(medicalRecord.getCode());
        updateRecordIds();
        writeMedicalRecord(medicalRecordMap);
    }

    public MedicalRecord searchByCode(String code) {
        return medicalRecordMap.get(code);
    }

    public void showMedicalRecord() {
        if (medicalRecordMap.isEmpty()) {
            System.err.println("khong co benh nhan nao trong danh sach");
            return;
        }
        medicalRecordMap.values().forEach(System.out::println);
    }

    private void updateRecordIds() {
        int newId = 1;
        for (MedicalRecord child : medicalRecordMap.values()) {
            child.setId(newId);
            newId++;
        }
    }

    private void writeMedicalRecord(Map<String, MedicalRecord> medicalRecordMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Module2\\demo\\demobaithithuchanh\\customers.csv"));
        ) {
            for (MedicalRecord child : medicalRecordMap.values()) {
                writer.write(child.getId() + "," + child.getCode() + "," + child.getNamePatient() + "," + child.getHospitalizedDay() + "," + child.getHospitalDischargeDate() + "," + child.getReasonForHospitalization());
                writer.newLine();
            }
        } catch (Exception _) {
        }
    }
}
