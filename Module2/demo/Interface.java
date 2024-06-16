package demo;


interface Demo {
    void keu();
}

interface Demo1  {

    void an();
}

public class Interface implements Demo1,Demo  {
    public void keu() {
        System.out.println("Hello");
    }
@Override
    public void an() {
        System.out.println("con meo dang an");
    }

    public static void main(String[] args) {
        Demo demo = new Interface();
        Demo1 demo1 = new Interface();
        demo.keu();
        demo1.an();
        Demo1 momo = () -> {System.out.println("con meo dang an");};
        momo.an();
    }
}
