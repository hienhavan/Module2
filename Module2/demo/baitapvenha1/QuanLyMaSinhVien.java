package demo.baitapvenha1;

public class QuanLyMaSinhVien {
    public   int MaSinhVien;
    public   String TenMaSinhVien;
    public String  email;
    public int number;
    public int GPA;
    public QuanLyMaSinhVien(int MaSinhVien, String TenMaSinhVien,String email, int number, int GPA ){
        this.MaSinhVien = MaSinhVien;
        this.TenMaSinhVien = TenMaSinhVien;
        this.email = email;
        this.number = number;
        this.GPA = GPA;
    }

    public int getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(int MaSinhVien) {
        MaSinhVien = MaSinhVien;
    }

    public String getTenMaSinhVien() {
        return TenMaSinhVien;
    }

    public void setTenMaSinhVien(String tenMaSinhVien) {
        TenMaSinhVien = tenMaSinhVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return
                "MSV:" + MaSinhVien + '\''
                + ", tên sinh viên:" + TenMaSinhVien + '\''
                + ", email:" + email + '\''
                + ", SDT:" + number + '\''
                + ", điểm GPA:" + GPA + '\''
                + '}'+'\n';
    }

}
