package demo.generics;

public class GenericsChild<T, U, V, N> extends Generics<T, U, V> {
    private N nd;

    public GenericsChild(T na, U nb, V nc, N nd) {
        super(na, nb, nc);
        this.nd = nd;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "nd+" + nd;
    }

    public static void main(String[] args) {
        GenericsChild<Integer, String, String, String> child = new GenericsChild<>(12, "hien", "as", "asd");
        System.out.println(child);
    }
}
