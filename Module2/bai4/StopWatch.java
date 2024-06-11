package bai4;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){}

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000000; i++) {
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
