package bai4;

public class Fan {
    private int SLOW = 1;
    private int MEDIUM = 2;
    private int FAST = 3;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private int speed = SLOW;

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Fan() {
    }

    @Override
    public String toString() {
        if (on == true) {
            return "Fan{" +
                    "fan is on" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", speed=" + speed +
                    '}';
        }
        return "Fan{" +
                "fan is off" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setSpeed(fan.FAST);
        fan.setOn(true);
        System.out.println(fan);
        Fan fan1 = new Fan();
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setSpeed(fan1.MEDIUM);
        System.out.println(fan1);
    }
}
