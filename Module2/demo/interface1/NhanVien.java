package demo.interface1;

public class NhanVien {
    protected String ma;
    protected String name;
    protected String phone;
    protected String chucvu;
    public NhanVien(String ma, String name, String phone, String chucvu){
        this.ma = ma;
        this.name = name;
        this.phone = phone;
        this.chucvu = chucvu;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ma='" + ma + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", chucvu='" + chucvu + '\'' +
                '}';
    }
}
