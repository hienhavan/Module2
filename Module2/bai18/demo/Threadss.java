package bai18.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadss {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit c�c c�ng vi?c (tasks) v�o thread pool
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker);
        }

        // Shutdown (ng?ng nh?n tasks m?i v� ch? c�c task c�n ?ang ch?y ho�n th�nh)
        executor.shutdown();

        // Ch? t?t c? c�c task trong pool ho�n th�nh
        while (!executor.isTerminated()) {
        }

        System.out.println("hoan thanh");
    }
}

class WorkerThread implements Runnable {

    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " dang thuc hien " + taskName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " da hoan thanh " + taskName);
    }
}
