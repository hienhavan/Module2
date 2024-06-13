package bai6.crirclecylinder;

public class App {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(5, "red", 30);
        System.out.println(c.volume());
        System.out.println(c.getArea());
    }
}
