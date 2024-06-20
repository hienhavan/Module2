package bai11.demsolanmottuxuathien;

import java.util.ArrayList;
import java.util.HashMap;

public class DemSoLanXuatHienTrongMap {
    public static void main(String[] args) {
        int count = 0;
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "2");
        map.put(5, "2");
        System.out.println(map);
        for (String key : map.values()) {
            if (key.equals("2")) {
                count++;
            }
        }
        System.out.println(count);
    }
}