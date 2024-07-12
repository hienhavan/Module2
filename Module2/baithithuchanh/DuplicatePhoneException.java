package baithithuchanh;

public class DuplicatePhoneException extends Exception {
    public DuplicatePhoneException(String message) {
        super(message);
    }
    public DuplicatePhoneException() {
        super("them moi khong thanh cong, ID da ton tai");
    }

}
