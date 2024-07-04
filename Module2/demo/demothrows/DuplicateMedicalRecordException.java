package demo.demothrows;

public class DuplicateMedicalRecordException extends Exception {
    public DuplicateMedicalRecordException() {
        super("benh nhan da ton ta");
    }

    public class Main {
        public static void checkMedicalRecord(String medicalRecordId) throws DuplicateMedicalRecordException {
            boolean isDuplicate = true;
            if (isDuplicate) {
                throw new DuplicateMedicalRecordException();
            }
        }
    }
}
