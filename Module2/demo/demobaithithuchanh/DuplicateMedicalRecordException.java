package demo.demobaithithuchanh;

public class DuplicateMedicalRecordException extends Exception {
    public DuplicateMedicalRecordException(String message) {
        super(message);
    }
    public DuplicateMedicalRecordException() {
        super("them moi khong thanh cong, benh nhan da ton tai");
    }

}
