package bai5.AccessModiflier;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public  Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }public double getArrea() {
        return Math.PI * radius * radius;
    }
}
