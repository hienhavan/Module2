package bai16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DocFile {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        try {
            FileReader reader = new FileReader("Module2\\bai16\\danhsach.csv");
            BufferedReader reader2 = new BufferedReader(reader);
            String line = reader2.readLine();
            while (line != null) {
                line = reader2.readLine();
                String[] txt = line.split(",");
                lines.add(Arrays.toString(txt) + '\n');
            }
//            reader.close();
//            reader2.close();
        } catch (Exception e) {
        }
        System.out.println(lines);
    }
}
