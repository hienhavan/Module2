package demo.iotext;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Files {
    public static void writeToFile(ArrayList<User> users) {
        try {
            // FileWriter khong qua bo dem, du lieu dc nap truc tiep khong qua trung gian( dùng de ghi du lieu duoi dang van ban)
            FileWriter fw = new FileWriter("date.txt");
            // BufferedReader su dung bo dem de tăng hieu suat, du lieu luu vao bo dem và chi luu khi day hoac dong close.
            BufferedWriter bw = new BufferedWriter(fw);
            for (User user : users) {
                bw.write(user.toString());
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws IOException {
//        String txt = "nguyen van a";
//        String[] array = {"nguyen van a", "nguyen van b", "le van c", "le van d"};
//        try {
//            FileWriter fw = new FileWriter("date.txt",true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            for (String line : array) {
//                bw.write(line);
//                bw.newLine();
//            }
//            bw.write(txt);
//
//            bw.close();
//            fw.close();
//        } catch (Exception e) {
//        }
//        ;

//ghi du lieu
        User user1 = new User("nguyen van a", "0123", "nu");
        User user2 = new User("nguyen van c", "01234", "nam");
        User user3 = new User("nguyen van d", "012345", "nu");
        User user4 = new User("nguyen van e", "0123456", "nam");
        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        writeToFile(users);

// doc du lieu
        List<String> userss = new ArrayList<String>();
        try {
            FileReader fr = new FileReader("date.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                String[] txt = line.split(",");
                String txt1 = Arrays.toString(line.split(","));
                userss.add(txt1);
                System.out.println(userss);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
// kiem tra xem file co ton tai khong
        File file = new File("date.txt");
        try {
            if (file.exists()) {
                System.out.println("file co ton tai");
            } else {
                System.out.println("file khong ton tai");
            }
            // kiem tra file co quyen read
            if (file.canRead()) {
                throw new FileNotFoundException("File can't be read");
            }
            // kiem tra file co quyen write
            if (file.canWrite()) {
                throw new FileNotFoundException("File can't be write");
            }
            // kiem tra file co quyen execute
            if (file.canExecute()) {
                throw new FileNotFoundException("File can't be execute");
            }
            // kiem tra file co quyen delete
            if (file.canExecute()) {
                throw new FileNotFoundException("File can't be delete");
            }
            // lay duong dan tuyet doi
            String filePath = file.getAbsolutePath();
            // lay ten filename
            String fileName = file.getName();

        } catch (Exception e) {
        }


//        // InputStream: la 1 lop truu tuong duoc su dung de doc du lieu
//        InputStream inputStream;
//        // doc du lieu tu tren he thonng
//        inputStream = new FileInputStream("date.txt");
//        // tang toc do doc file
//        InputStream inputStreams = new BufferedInputStream(inputStream);
//        System.out.println(inputStreams);
//        // doc du lieu va chuyen doi no thanh kieu nguyen thuy
//        InputStream inputStreamss = new BufferedInputStream(inputStream);
//        System.out.println(inputStreamss);



//        //OutputStream: la lop truu tuong duoc su dung de ghi du lieu den dich duoi dạng nhi phan
//        OutputStream outputStream;
//        outputStream = new FileOutputStream("date.txt");
//        // tang toc do ghi file
//        OutputStream outputStreams = new BufferedOutputStream(outputStream);
//        System.out.println(outputStreams);
//        // ghi du lieu va chuyen doi no thanh kieu nguyen thuy
//        OutputStream outputStreamss = new DataOutputStream(outputStream);
//        System.out.println(outputStreamss);
    }
}
