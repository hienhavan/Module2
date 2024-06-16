package demo.generics;

public class Generics<T, U, V> {
    private T na;
    private U nb;
    private V nc;

    public Generics(T na, U nb, V nc) {
        this.na = na;
        this.nb = nb;
        this.nc = nc;
    }

    public T getNa() {
        return na;
    }

    public void setNa(T na) {
        this.na = na;
    }

    public U getNb() {
        return nb;
    }

    public void setNb(U nb) {
        this.nb = nb;
    }

    public V getNc() {
        return nc;
    }

    public void setNc(V nc) {
        this.nc = nc;
    }

    @Override
    public String toString() {
        return "generics{" +
                "na=" + na +
                ", nb=" + nb +
                ", nc=" + nc +
                '}';
    }

    public static void main(String[] args) {
        Generics<Integer, String, Double> generics = new Generics<>(1, "2", 3.0);
        System.out.println(generics.toString());
    }
}