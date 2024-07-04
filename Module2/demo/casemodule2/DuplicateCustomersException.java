package demo.casemodule2;

public class DuplicateCustomersException extends Exception {
    public DuplicateCustomersException(String message) {
        super(message);
    }
    public DuplicateCustomersException() {
        super("them moi khong thanh cong, khach hang da ton tai");
    }

}

