package bai6.poveablepoint;

public class Point {
    protected float x, y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public  Point(){}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    @Override
    public String toString() {
        return "("+
                "x=" + x +
            ", y=" + y +")" ;
    }
}
