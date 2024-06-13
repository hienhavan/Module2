package demo.DemoOOP;

import java.util.Date;

public class GeometricOject {
    protected   String color;
    protected   boolean filled;
    protected Date dateCreated;
    public GeometricOject(){
    }
    public GeometricOject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricOject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
