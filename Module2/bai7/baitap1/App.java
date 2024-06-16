package bai7.baitap1;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        Random random = new Random();
        for (Resizeable shape : shapes) {
            double resizePercent = random.nextDouble() * 100;
            System.out.println("gia tri ban dau:" + shape);
            shape.resize(resizePercent);
            System.out.println("gia tri sau khi tang:" + shape);
        }
    }


}
