package demo.demothrows;

import static demo.demothrows.DuplicateMedicalRecordException.Main.checkMedicalRecord;

public class App {

    public static void main(String[] args) {
        try {
            checkMedicalRecord("MR12345");
        } catch (DuplicateMedicalRecordException e) {
            System.out.println("?ã x?y ra ngo?i l?: " + e.getMessage());
        }
    }
}
