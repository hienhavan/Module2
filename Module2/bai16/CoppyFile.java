package bai16;

import java.io.*;
import java.util.Arrays;

public class CoppyFile {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream("Module2\\bai16\\file1.csv");
            outStream = new FileOutputStream("Module2\\bai16\\file2.csv");
            int length;
            byte[] buffer = new byte[50];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (Exception e) {
        } finally {
            assert inStream != null;
            inStream.close();
            assert outStream != null;
            outStream.close();
        }
    }
}
