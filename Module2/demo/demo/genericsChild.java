package demo.demo;

public class genericsChild<T,U,V,N> extends generics {
    private  N nd;
    public genericsChild(T na, U nb, V nc, N nd) {
        super(na, nb, nc);
        this.nd = nd;
    }
}
