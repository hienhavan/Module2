package demo.interface1;

public class NhanVienVanPhong extends NhanVien{
    private String maxuong;
    private int type;
    public NhanVienVanPhong(String ma, String name, String phone, String chucvu, String maxuong, int type) {
        super(ma, name, phone, chucvu);
        this.maxuong = maxuong;
        this.type = type;
    }
}
