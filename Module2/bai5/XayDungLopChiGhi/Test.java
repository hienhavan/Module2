package bai5.XayDungLopChiGhi;

public class Test extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLop("c04");
        student.setName("Hung");
        System.out.println(student);
        Student student2 = new Student();
        student2.setLop("c03");
        student2.setName("Hg");
        System.out.println(student2);
        Student student3 = new Student();
        student3.name = "hai";
        System.out.println(student3);
        Student student4 = new Student();
        student4.name = "hai2";
        System.out.println(student4);
    }
}
