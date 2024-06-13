package demo.demo;

public class GenericsChild<T,U,V,N> extends Generics {
    private  N nd;
    public GenericsChild(T na, U nb, V nc, N nd) {
        super(na, nb, nc);
        this.nd = nd;
    }
}
