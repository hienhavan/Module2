package demo.iotext;

import java.io.*;
import java.util.Scanner;

public class IoText {
    public static void main(String[] args) throws IOException {
        File file = new File("iotext.text");
        InputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }
}
