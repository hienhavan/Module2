package demo.demoOOP;

public class Rectangle extends GeometricOject{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
}
