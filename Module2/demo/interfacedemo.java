package demo;


interface Demo {
     void keu ();
}
interface Demo1 {
     void keu ();
     void an ();
}
public class interfacedemo implements Demo, Demo1 {
    public void keu() {
        System.out.println("Hello");
    }
    public void an() {
        System.out.println("con meo dang an");
    }
    public static void main(String[] args) {
Demo demo = new interfacedemo();
Demo1 demo1 = new interfacedemo();
demo.keu();
demo1.an();
    }
}
