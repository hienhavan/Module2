package bai18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads extends Thread {
    private String name;

    public Threads(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(name + i);
        }
    }

    public static void main(String[] args) {
//        Threads t = new Threads("t");
//        Threads s = new Threads("s");
//        s.setPriority(Thread.MAX_PRIORITY);
//        t.start();
//        s.start();


        ExecutorService e = Executors.newFixedThreadPool(5);
//        Threads t = new Threads("t");
//        Threads s = new Threads("s");
//        e.submit(t);
//        e.submit(s);


        /**
         * cách v?t ng?n g?n s? d?ng bi?u th?c lambda thay vì t?o ??i t??ng sau ?ó truy?n vào submit và exeutor.
         */

        e.submit(() -> {
            {
                for (int i = 0; i < 15; i++) {
                    System.out.println("h" + i);
                }
            }
        });
        e.submit(() -> {
            {
                for (int i = 0; i < 15; i++) {
                    System.out.println("k" + i);
                }
            }
        });
    }
}
