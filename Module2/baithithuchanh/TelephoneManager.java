package baithithuchanh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class TelephoneManager extends DuplicatePhoneException {
    DuplicatePhoneException e;
    private final Map<Integer, Telephone> phoneMap;

    public TelephoneManager() {
        this.phoneMap = new HashMap<>();
    }

    public void addPhone(Telephone phone) {
        if (phoneMap.containsKey(phone.getId())) {
            e = new DuplicatePhoneException();
            System.out.println(e.getMessage());
            return;
        }
        phoneMap.put(phone.getId(), phone);
        System.err.println("them moi thanh cong");
        writePhone(phoneMap);
    }

    public void deletePhone(Telephone phone) {
        phoneMap.remove(phone.getId());
        updateRecordIds();
        writePhone(phoneMap);
    }

    public Telephone searchByid(int id) {
        System.out.println(phoneMap.get(id));
        return phoneMap.get(id);
    }

    public void showPhone() {
        if (phoneMap.isEmpty()) {
            System.err.println("khong thiet bi co trong danh sach");
            return;
        }
        phoneMap.values().forEach(System.out::println);
    }

    private void updateRecordIds() {
        int newId = 1;
        for (Telephone child : phoneMap.values()) {
            child.setId(newId);
            newId++;
        }
    }

    private void writePhone(Map<Integer, Telephone> phoneMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Module2\\baithithuchanh\\date\\mobiles.csv"))
        ) {
            for (Telephone child : phoneMap.values()) {
                writer.write(child.toString());
                writer.newLine();
            }
        } catch (Exception _) {
        }
    }
}

