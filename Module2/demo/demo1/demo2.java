package demo.demo1;


public class demo2 {
    public record point (int x, int y) {
        // Không c?n khai báo constructors, getters/setters, equals, hashCode, toString

    }

    public static void main(String[] args) {
        var p1 = new point(10, 20);
        System.out.println(p1.x);
        String line = """
                x: %d,
                y: %d,
                p1.x, p1.y""";

        System.out.println(line);
    }
}
