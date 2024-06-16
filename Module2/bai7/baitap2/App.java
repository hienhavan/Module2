package bai7.baitap2;

public class App {
    public static void main(String[] args) {
        Colrable[] cols = new Colrable[1];
        cols[0] = new Square();
        for (Colrable col : cols) {
            col.howToColor();
        }
    }
}
