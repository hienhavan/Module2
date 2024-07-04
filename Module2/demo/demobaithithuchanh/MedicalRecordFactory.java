package demo.demobaithithuchanh;

public interface MedicalRecordFactory {
    MedicalRecord createMedicalRecord(int id, String code, String namePatient, String hospitalizedDay, String hospitalDischargeDate, String reasonForHospitalization);
}

