package bai5.XayDungLopChiGhi;

public class Student {
    protected String name = "john";
    private String lop = "CO2";
    public  Student(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
