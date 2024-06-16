package demo.enums;

public enum Enums {
    DAT_HANG(5),
    CHUAN_BI(10),
    GIAO_HANG(30),
    GIAO_HANG_THANH_CONG(1),
    GIAO_HANG_KHONG_THANH_CONG(-1),
    HUY_DAT_HANG(0),
    HUY_DAT_HANG_THANH_CONG(2);
    final int thoiGian;
    Enums(int thoiGian){
        this.thoiGian = thoiGian;
    }
}
